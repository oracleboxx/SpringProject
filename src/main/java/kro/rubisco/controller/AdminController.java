package kro.rubisco.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kro.rubisco.dto.CategoryDTO;
import kro.rubisco.dto.GroupDTO;
import kro.rubisco.service.CategoryService;
import kro.rubisco.service.GroupService;

@Controller
@RequestMapping("/admin")
public class AdminController {
private final CategoryService categoryService;
private final GroupService groupService;

public AdminController(CategoryService categoryService, GroupService groupService) {
	this.categoryService= categoryService;
	this.groupService=groupService;
	
}
@GetMapping("/category")
public String getCategroyListView(Model model) throws Exception{
	List<CategoryDTO> categoryList =categoryService.ListAll();
	model.addAttribute("categoryList" , categoryList);
	return "category/getCategoryList";
		}

@PostMapping("/category")
public String insertCategory(CategoryDTO category)throws Exception{
	
	categoryService.regist(category);
	return "redirect:/admin/category";
}

@PatchMapping("/category")
public String updateCategory(CategoryDTO category)throws Exception{
	categoryService.modify(category);
	return "redirect:/admin/catrgory";
}

@GetMapping("/group")
public String getGroupListView(Model model) throws Exception {
	
	List<GroupDTO> groupList = groupService.ListAll();
	model.addAttribute("gorupList", groupList);
	return "group/getGroupList";
}
@PostMapping("/group")
public String insertGroup(GroupDTO group) throws Exception {
    groupService.regist(group);
    return "redirect:/admin/group";
}

@PatchMapping("/group")
public String updateCategory(GroupDTO group) throws Exception {
    groupService.modify(group);
    return "redirect:/admin/group";
}

}