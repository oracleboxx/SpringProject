package kro.rubisco.dao;

import java.util.List;

import kro.rubisco.dto.CommentDTO;

public interface CommentDAO {
public void create(CommentDTO comment)throws Exception;

public CommentDTO read(Long commentId)throws Exception;

public void update(CommentDTO comment)throws Exception;

public void delete(Long commentId)throws Exception;

public List<CommentDTO> ListAll() throws Exception;

}
