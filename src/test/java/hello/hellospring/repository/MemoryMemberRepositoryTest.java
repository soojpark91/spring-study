package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    // 각 테스트 이후 실행
    // 각 테스트의 데이터가 서로 간섭 받지 않도록
    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName("soojin");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("spring1");;
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");;
        repository.save(member2);

        // Optional<Member>  result = repository.findByName("spring1");
        Member result = repository.findByName("spring1").get();

        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void  findAll(){
        Member member1 = new Member();
        member1.setName("spring1");;
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");;
        repository.save(member2);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);
    }
}
