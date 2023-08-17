package kro.rubisco.service;

import java.util.List;

import kro.rubisco.dto.GroupDTO;

public interface GroupService {
public void regist(GroupDTO group)throws Exception;

public GroupDTO read(Long groupId)throws Exception;

public void modify(GroupDTO group)throws Exception;

public void remove(GroupDTO group)throws Exception;

public List<GroupDTO> ListAll() throws Exception;

}
