package kro.rubisco.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import kro.rubisco.dao.CommentDAO;
import kro.rubisco.dto.CommentDTO;
import kro.rubisco.service.CommentService;

public class CommentServiceImpl implements CommentService {
private final CommentDAO commentDAO;
	@Autowired
	public CommentServiceImpl(SqlSession sqlSession) {
		this.commentDAO =sqlSession.getMapper(CommentDAO.class);
		
	}
	@Override
	public void regist(CommentDTO comment) throws Exception {
		commentDAO.create(comment);
	}

	@Override
	public CommentDTO read(Long commentId) throws Exception {
		
		return commentDAO.read(commentId);
	}

	@Override
	public void modify(CommentDTO comment) throws Exception {
		commentDAO.update(comment);
	}

	@Override
	public void remove(Long commentId) throws Exception{
		commentDAO.delete(commentId);
	}

	@Override
	public List<CommentDTO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return commentDAO.ListAll();
	}

}