package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemeberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class AppConfig {
 
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemberRepository memberRepository() {
        return new MemoryMemeberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discoundPolicy());
    }

    public DiscountPolicy discoundPolicy() {
        return new FixDiscountPolicy();
    }
}
