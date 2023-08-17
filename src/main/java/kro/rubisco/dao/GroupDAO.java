package kro.rubisco.dao;

import java.util.List;

import kro.rubisco.dto.GroupDTO;

public interface GroupDAO {
public void create(GroupDTO group)throws Exception;

public GroupDTO read(Long groupId) throws Exception;

public void update(GroupDTO group) throws Exception;

public void delete(GroupDTO group) throws Exception;

public List<GroupDTO> ListAll() throws Exception;

}
