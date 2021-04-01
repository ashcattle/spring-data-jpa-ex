package me.pjs.datajpa.repository;

import me.pjs.datajpa.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

// spring data jpa -> interface로 repository를 생성하면 구현체들을 제공해줌
public interface MemberRepository extends JpaRepository<Member, Long> {
}
