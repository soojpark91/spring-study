package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* 직접 스프링 빈에 등록하는 방법
* 실무에서 주로 정형화된 컨트롤러, 서비스, 레포지토리 같은 코든느 컴포넌트 스캔을 사용한다.
* 정형화 되지 않거나, 상황에 따라 구현 클래스를 변경해야 하면 설정을 통해 스프링빈으로 등록한다.
* */
@Configuration
public class SpringConfig {

//    @Bean
//    public MemberService memberService(){
//        return new MemberService(memberRepository());
//    }
//
//    @Bean
//    public MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//    }
}
