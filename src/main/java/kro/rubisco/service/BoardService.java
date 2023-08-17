package kro.rubisco.service;

import kro.rubisco.dto.BoardDTO;
import kro.rubisco.dto.PageDTO;
import kro.rubisco.dto.SearchDTO;

public interface BoardService {
public void regist(BoardDTO board) throws Exception;

public BoardDTO read(Long boardId) throws Exception;

public void modify(BoardDTO board) throws Exception;

public void remove(Long documentId) throws Exception;


public PageDTO<BoardDTO> listAll(PageDTO<BoardDTO> boardPage, SearchDTO search) throws Exception;


}
