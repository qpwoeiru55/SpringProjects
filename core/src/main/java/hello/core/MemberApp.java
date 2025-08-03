package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class  MemberApp {

    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member membera = new Member(1L, "membera", Grade.vip);

        memberService.join(membera);

        Member fideMember = memberService.findMember(1L);
        System.out.println("fideMember = " + fideMember.getName());
        System.out.println("membera = " + membera.getName());
    }

}
