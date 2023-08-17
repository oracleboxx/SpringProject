package kro.rubisco.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kro.rubisco.config.TestException;
import kro.rubisco.dto.BoardDTO;
import kro.rubisco.dto.PageDTO;
import kro.rubisco.dto.SearchDTO;
import kro.rubisco.service.BoardService;
import kro.rubisco.service.CategoryService;

@Controller
@RequestMapping("/board")
public class BoardController {
private final BoardService boardService;
private final CategoryService categoryService;

public BoardController(BoardService boardSerivce, CategoryService categoryService) {
	 this.boardService =boardSerivce;
      this.categoryService = categoryService;
	
}
@GetMapping()
public String getBoardListView(
		PageDTO<BoardDTO> boardPage,
		SearchDTO search , Model model) throws Exception {
	model.addAttribute("pageInfo" , boardService.listAll(boardPage, search));
	model.addAttribute("boardList", boardPage.getContentList());
	return "board/getBoardList";
	
}








@GetMapping("/{documentId")
public String getBoardView(
@PathVariable("documentId") Long documentId, Model model) throws Exception{
	model.addAttribute("board",boardService.read(documentId));
	return "board/getBoard";
}

@GetMapping(params ="act=write")
public String getInsertBoardView(
@RequestParam(value="documentId", required=false)Long documentId, Model model
)throws Exception{

		model.addAttribute("board",documentId == null ? new BoardDTO() : boardService.read(documentId));
		model.addAttribute("categoryList",categoryService.ListAll());
		return "board/insertBoard";
	}
@PostMapping()
public String inserBoard(BoardDTO board) throws Exception{
	
	boardService.regist(board);
	return "redirect:/board/" + board.getDocumentId();
}


@PatchMapping(params="documentId")
public String updateBoard(BoardDTO board)throws Exception{
	
	boardService.modify(board);
	return "redirect:/board/" + board.getDocumentId();
	
}
@DeleteMapping(params = "documentId")
public String deleteBoard(
    @RequestParam("documentId") Long documentId
)throws Exception {
    boardService.remove(documentId);
    return "redirect:/board";
}


@ExceptionHandler(TestException.class)
public ModelAndView testExceptionHandler(Exception e) {
	ModelAndView mv = new ModelAndView();
	mv.setStatus(HttpStatus.BAD_REQUEST);
	mv.setViewName("/error/error");
	return mv;
		
	
}


}



