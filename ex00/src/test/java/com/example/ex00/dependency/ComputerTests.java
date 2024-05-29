package com.example.ex00.dependency;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j

public class ComputerTests {

    //단위 테스트에서는 필드주입만 사용 가능하다.
    @Autowired  //Autowired는 메소드 안에서 사용하면 안 됨.
                //메소드 안에 있는 지역변수는 Autowired가 안 됨
    Coding coding;


    @Test
    public void computerTest(){
        log.info(coding.getComputer().toString());

    }
}
// 의존성 주입을 위한 간단한 예시 (Autowired 하기 전 예시)
// coding은 new를 해서 null이 아님, computer는 new를 안 해서 null이 나옴.
// 그래서 toString으로 접근할 수 없어서 nullPointException이 뜸
// Coding클래스에서 computer를 new 하면 주소값이 생겨서 null 이 안 나옴.
