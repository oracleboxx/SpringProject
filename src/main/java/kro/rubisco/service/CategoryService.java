package kro.rubisco.service;

import java.util.List;

import kro.rubisco.dto.CategoryDTO;

public interface CategoryService {
public void regist(CategoryDTO category) throws Exception;

public CategoryDTO read(Long categoryId) throws Exception;

public void modify(CategoryDTO category)throws Exception;

public void remove(Long categoryId)throws Exception;


public  List<CategoryDTO> ListAll() throws Exception;


}
