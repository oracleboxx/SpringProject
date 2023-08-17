package kro.rubisco.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import kro.rubisco.config.BindExceptionWithViewName;
@ControllerAdvice
public class ExceptionHandlingController {
	  
	    @ExceptionHandler(BindExceptionWithViewName.class)
	    protected String handleBadRequest(BindExceptionWithViewName e, Model model) {
	        ModelAndView mv = new ModelAndView();
	        mv.addObject("errors", e);
	   
	        return e.getViewName();
	    }
}
