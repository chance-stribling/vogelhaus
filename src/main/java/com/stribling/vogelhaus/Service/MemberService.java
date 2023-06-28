package com.stribling.vogelhaus.Service;

import com.stribling.vogelhaus.Entity.Member;
import com.stribling.vogelhaus.Model.MemberModel;
import com.stribling.vogelhaus.RNF.ResourceNotFoundException;
import com.stribling.vogelhaus.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;
    public Member createMember(MemberModel memberModel) {
        Member member = new Member(memberModel);
        return memberRepository.save(member);
    }

    public Member updateMember(MemberModel memberModel) {
        Optional<Member> memberDB = this.memberRepository.findById(memberModel.getId());

        if(memberDB.isPresent()) {
            Member memberUpdate = memberDB.get();
            memberUpdate.setId(memberModel);
            memberUpdate.setName(memberModel);
            memberUpdate.setUserName(memberModel);
            memberUpdate.setPassword(memberModel);
            memberUpdate.setRole(memberModel);
            memberRepository.save(memberUpdate);
            return memberUpdate;
        }else {
            throw new ResourceNotFoundException("Record not found with id : " + memberModel.getId());
        }
    }
    public List<Member> getAllMembers() {
        return this.memberRepository.findAll();
    }
    public Member getMemberById(Long memberId) {

        Optional<Member> member = this.memberRepository.findById(memberId);

        if(member.isPresent()) {
            return member.get();
        }else {
            throw new ResourceNotFoundException("Record not found with id : " + memberId);
        }
    }
    public void deleteMember(Long memberId) {
        Optional<Member> memberDb = this.memberRepository.findById(memberId);

        if(memberDb.isPresent()) {
            this.memberRepository.delete(memberDb.get());
        }else {
            throw new ResourceNotFoundException("Record not found with id : " + memberId);
        }

    }
}
