package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;

@Setter
@Getter
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {

        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("test!!!");
        String test = helloLombok.getName();
        System.out.println(test);

        System.out.println(helloLombok);
    }
}
