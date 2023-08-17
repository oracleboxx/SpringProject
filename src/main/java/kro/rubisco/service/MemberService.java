package kro.rubisco.service;

import java.util.List;

import kro.rubisco.dto.MemberDTO;

public interface MemberService {

public void regist(MemberDTO member)throws Exception;

public MemberDTO read(Long memberId)throws Exception;

public void modify(MemberDTO member)throws Exception;

public void remove(MemberDTO member)throws Exception;

public List<MemberDTO> ListAll() throws Exception;

}
