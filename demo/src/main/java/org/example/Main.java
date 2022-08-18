package org.example;

import lombok.Data;
import org.junit.Test;

import java.util.Objects;

/**
 * @author ：maqin
 * @date ：Created in ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @Test
    public void test(){
        Student student = null;


        if (Objects.isNull(student)) {
            System.out.println("为空");
        }



    }


}

@Data
class Student{
    private String name;
    private String email;

}