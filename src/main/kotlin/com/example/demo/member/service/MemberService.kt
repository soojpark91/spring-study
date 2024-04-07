package com.example.demo.member.service

import com.example.demo.common.exception.InvalidInputException
import com.example.demo.member.dto.MemberDtoRequest
import com.example.demo.member.entity.Member
import com.example.demo.member.repository.MemberRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Transactional
@Service
class MemberService (private val memberRepository : MemberRepository){
    /**
     * 회원가입
     * **/
     fun singUp(memberDtoRequest: MemberDtoRequest): String{
         // ID 중복검사
         var member: Member? = memberRepository.findByLoginId(memberDtoRequest.loginId)
         if(member != null){
             throw InvalidInputException("loginId", "이미 등록된 ID 입니다.")
         }

         member = memberDtoRequest.toEntity()
         memberRepository.save(member)

         return "회원 가입이 완료되었습니다."
     }
}