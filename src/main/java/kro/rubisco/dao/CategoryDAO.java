package kro.rubisco.dao;

import java.util.List;

import kro.rubisco.dto.CategoryDTO;

public interface CategoryDAO {
public void create(CategoryDTO category) throws Exception;

public CategoryDTO read(Long categoryId) throws Exception;

public void update(CategoryDTO category) throws Exception;

public void delete(Long categoryId)throws Exception;

public List<CategoryDTO> ListAll() throws Exception;
}
