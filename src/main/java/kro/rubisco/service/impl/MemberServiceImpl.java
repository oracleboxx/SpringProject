package kro.rubisco.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import kro.rubisco.dao.MemberDAO;
import kro.rubisco.dto.MemberDTO;
import kro.rubisco.service.MemberService;

public class MemberServiceImpl implements MemberService {
private MemberDAO memberDAO;

@Autowired
public MemberServiceImpl(SqlSession sqlSession) {
	
	this.memberDAO =sqlSession.getMapper(MemberDAO.class);
}
@Override
public void regist(MemberDTO member) throws Exception {
	memberDAO.create(member);
	
}

@Override
public MemberDTO read(Long memberId) throws Exception {
	// TODO Auto-generated method stub
	return memberDAO.read(memberId);
}

@Override
public void modify(MemberDTO member) throws Exception {
	memberDAO.update(member);
}

@Override
public void remove(MemberDTO member) throws Exception {
	memberDAO.delete(member);
}

@Override
public List<MemberDTO> ListAll() throws Exception {

	return memberDAO.ListAll();
}

}
