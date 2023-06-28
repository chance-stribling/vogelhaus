package com.stribling.vogelhaus.Controller;

import com.stribling.vogelhaus.Entity.Member;
import com.stribling.vogelhaus.Model.MemberModel;
import com.stribling.vogelhaus.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;

    @PostMapping("/member")
    public Member createMember(@RequestBody MemberModel memberModel){
        return this.memberService.createMember(memberModel);
    }


    @PutMapping("/member/{id}")
    public Member updateMember(@PathVariable Long id, @RequestBody MemberModel memberModel){
        memberModel.setId(id);
        return this.memberService.updateMember(memberModel);
    }

    @GetMapping("/members")
    public List<Member> getAllMembers(){
        return memberService.getAllMembers();
    }
    @DeleteMapping("/members/{id}")
    public HttpStatus deleteMember(@PathVariable Long id){
        this.memberService.deleteMember(id);
        return HttpStatus.OK;
    }
}
