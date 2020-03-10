package com.example.sbadmin.persistence;

import com.example.sbadmin.domain.MemberVO;

public interface MemberDAO {
	public String getTime();
	
	public void insertMember(MemberVO vo);
	
	public MemberVO selectMember(String userid);
}
