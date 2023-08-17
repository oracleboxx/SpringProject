package kro.rubisco.controller;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kro.rubisco.config.BindExceptionWithViewName;
import kro.rubisco.dto.ProductDTO;

@Controller
@RequestMapping("/test")
public class TestController {
private final MessageSource messageSource = null;


	@GetMapping()
	public void getTestView() {
		
	}
	@PostMapping()
	public String getTestView(@ModelAttribute("product") ProductDTO product, 
	        BindingResult bindingResult, 
	        Locale locale)throws BindException{
	
	
		
		if(bindingResult.hasErrors()) {
			throw new BindExceptionWithViewName(bindingResult,"/test", messageSource, locale );
			
		}

		return "redirect:/test";
	}
}
