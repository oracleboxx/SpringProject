package kro.rubisco.dao;

import java.util.List;

import kro.rubisco.dto.MemberDTO;

public interface MemberDAO {
public void create(MemberDTO member)throws Exception;

public MemberDTO read(Long memberId)throws Exception;

public void update(MemberDTO member)throws Exception;

public void delete(MemberDTO member)throws Exception;

public List<MemberDTO> ListAll() throws Exception;

}
