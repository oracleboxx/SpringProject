package kro.rubisco.service;

import java.util.List;

import kro.rubisco.dto.CommentDTO;

public interface CommentService {
    void regist(CommentDTO comment) throws Exception;

    CommentDTO read(Long commentId) throws Exception;

    void modify(CommentDTO comment) throws Exception;

    void remove(Long commentId) throws Exception;

    List<CommentDTO> listAll() throws Exception;
}