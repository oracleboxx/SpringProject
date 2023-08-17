package kro.rubisco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kro.rubisco.dto.CommentDTO;
import kro.rubisco.service.CommentService;

@Controller
@RequestMapping("/comment")
public class CommentController {
private CommentService commentService;


public void setCommentService(CommentService commentService) {
	this.commentService = commentService;
}

@PostMapping(params="commentId")
public String insertComment(CommentDTO comment) throws Exception{
	
 commentService.regist(comment);
 return "redirect:/board/" + comment.getDocumentId();
}

@PatchMapping(params = "commentId")
public String updateComment(CommentDTO comment) throws Exception{
	commentService.modify(comment);
	return "redirect:/board/" + comment.getDocumentId();
}

@DeleteMapping(params = "commentId")
public String deleteComment(CommentDTO comment) throws Exception {
    commentService.remove(comment.getCommentId());
    return "redirect:/board/" + comment.getDocumentId();
}

}
