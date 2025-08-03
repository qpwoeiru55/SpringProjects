package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPTest {

    RateDiscountP rateDiscountP = new RateDiscountP();

    @Test
    void vip_O(){
        //given
        Member member = new Member(1L,"memvip", Grade.vip);
        //when
        int discount = rateDiscountP.discount(member, 10000);

        Assertions.assertThat(discount).isEqualTo(1000);

    }

    @Test
    void vip_No(){
        //given
        Member member = new Member(1L,"memvip", Grade.dasd);
        //when
        int discount = rateDiscountP.discount(member, 10000);

        Assertions.assertThat(discount).isEqualTo(1000);

    }

}