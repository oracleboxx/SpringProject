package kro.rubisco.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kro.rubisco.dao.CategoryDAO;
import kro.rubisco.dto.CategoryDTO;
import kro.rubisco.service.CategoryService;
@Service
@Transactional(readOnly =true)
public class CategoryServiceImpl implements CategoryService {
private final CategoryDAO categoryDAO;

@Autowired
public CategoryServiceImpl(SqlSession sqlSession) {
	this.categoryDAO=sqlSession.getMapper(CategoryDAO.class);
}


	@Override
	public void regist(CategoryDTO category) throws Exception {
	categoryDAO.create(category);
	}

	@Override
	public CategoryDTO read(Long categoryId) throws Exception {
		// TODO Auto-generated method stub
		return categoryDAO.read(categoryId);
	}

	@Override
	public void modify(CategoryDTO category) throws Exception {
		categoryDAO.update(category);
	}

	@Override
	public void remove(Long categoryId) throws Exception {
	 categoryDAO.delete(categoryId);
	}

	@Override
	public List<CategoryDTO> ListAll() throws Exception {

		return categoryDAO.ListAll();
	}

}
