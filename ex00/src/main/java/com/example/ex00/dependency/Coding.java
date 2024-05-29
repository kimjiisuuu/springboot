package com.example.ex00.dependency;

import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component //스프링 빈에 등록해준다.
public class Coding {
    //필드 주입
    //
    @Autowired
    private Computer computer;
}
