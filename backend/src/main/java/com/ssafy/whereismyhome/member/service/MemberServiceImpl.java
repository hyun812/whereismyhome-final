package com.ssafy.whereismyhome.member.service;

import com.ssafy.whereismyhome.member.model.mapper.MemberMapper;
import com.ssafy.whereismyhome.member.model.MemberDto;
import com.ssafy.whereismyhome.member.model.SignUpMemberRequestDto;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    public MemberServiceImpl(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @Override
    public MemberDto loginMember(String user_id, String password) throws SQLException {
        return memberMapper.loginMember(user_id, password);
    }

    @Override
    public int signUpMember(SignUpMemberRequestDto memberDto) throws SQLException {
        return memberMapper.signUpMember(memberDto);
    }

    @Override
    public int updateMember(MemberDto memberDto) throws SQLException {
        return memberMapper.updateMember(memberDto);
    }

    @Override
    public int deleteMemberByUserId(String user_id) throws SQLException {
        return memberMapper.deleteMemberByUserId(user_id);
    }

    @Override
    public List<MemberDto> getMembers() throws SQLException {
        return memberMapper.getMembers();
    }

    @Override
    public MemberDto getMemberByUserId(String user_id) throws SQLException {
        return memberMapper.getMemberByUserId(user_id);
    }

}