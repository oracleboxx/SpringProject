package kro.rubisco.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kro.rubisco.dao.BoardDAO;
import kro.rubisco.dto.BoardDTO;
import kro.rubisco.dto.PageDTO;
import kro.rubisco.dto.SearchDTO;
import kro.rubisco.service.BoardService;

@Service
@Transactional(readOnly =true)
public class BoardServiceImpl implements BoardService {
	
	
private final BoardDAO boardDAO;

 @Autowired
 public BoardServiceImpl(SqlSession sqlSession) {
	 
	 this.boardDAO= sqlSession.getMapper(BoardDAO.class);
 }
	@Override
	public void regist(BoardDTO board) throws Exception {


		boardDAO.create(board);
	}

	@Override
	public BoardDTO read(Long documentId) throws Exception {
		
		return boardDAO.read(documentId);
	}

	@Override
	public void modify(BoardDTO board) throws Exception {
		boardDAO.update(board);
	}

	@Override
	 public void remove(Long documentId) throws Exception {
        // Check if the documentId exists in the comments table
        boolean documentExistsInComments = boardDAO.checkDocumentExistsInComments(documentId);

        if (documentExistsInComments) {
            throw new Exception("Cannot delete the document because it has related comments.");
        }
boardDAO.delete(documentId);
		
	}

	
	@Override
	public PageDTO<BoardDTO> listAll(PageDTO<BoardDTO> boardPage , SearchDTO search) throws Exception {
		boardPage.setContentList(boardDAO.listAll(boardPage, search));
		boardPage.setTotalsize(boardDAO.getCount(search));
		return boardPage;
	} 
	
	
	
}
