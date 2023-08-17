package kro.rubisco.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import kro.rubisco.dao.GroupDAO;
import kro.rubisco.dto.GroupDTO;
import kro.rubisco.service.GroupService;

public class GroupServiceImpl implements GroupService {
private final GroupDAO groupDAO;
	
	
	@Autowired
public GroupServiceImpl(SqlSession sqlSession) {
	this.groupDAO = sqlSession.getMapper(GroupDAO.class);
}
	@Override
	public void regist(GroupDTO group) throws Exception {
		groupDAO.create(group);
	}

	@Override
	public GroupDTO read(Long groupId) throws Exception {
	
		return groupDAO.read(groupId);
	}

	@Override
	public void modify(GroupDTO group) throws Exception {
		groupDAO.update(group);
	}

	@Override
	public void remove(GroupDTO group) throws Exception {
		groupDAO.delete(group);
	}

	@Override
	public List<GroupDTO> ListAll() throws Exception {
	
		return groupDAO.ListAll();
	}

}
