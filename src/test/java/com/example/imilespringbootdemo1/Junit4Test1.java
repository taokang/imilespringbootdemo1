package com.example.imilespringbootdemo1;


import com.example.imilespringbootdemo1.service.GitTest1;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description:
 * @author: taokang
 * @createDate: 2021/10/11
 * @version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Junit4Test1 {

    @Autowired
    private GitTest1 gitTest1;

    @Test
    public void show(){
        System.out.println("this is a test");
        gitTest1.show();
    }
}
