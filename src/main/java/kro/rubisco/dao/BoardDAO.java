package kro.rubisco.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import kro.rubisco.dto.BoardDTO;
import kro.rubisco.dto.PageDTO;
import kro.rubisco.dto.SearchDTO;

@Mapper
public interface BoardDAO {
public void create(BoardDTO board) throws Exception;

public BoardDTO read(Long documentId) throws Exception;

public void update(BoardDTO board) throws Exception;

public void delete(Long documentId) throws Exception;

public List<BoardDTO> listAll(
		@Param("board") PageDTO<BoardDTO> boardPage ,
		@Param("search") SearchDTO search
		
		) throws Exception;
public long getCount(SearchDTO search) throws Exception;


boolean checkParentExists(Long memberId);
    boolean checkDocumentExistsInComments(Long documentId);



	
}

