package ru.otus.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.otus.spring.domain.Person;
import ru.otus.spring.service.PersonService;

import java.util.Scanner;

@Configuration
@ComponentScan
public class Main {

//    @Value("${question.path}")
//    public static String questionPath;
//    @Value("${answers.path}")
//    public static String AnswersPath;
//    @Value("${correctAnswerPath}")
//    public static String CorrectAnsPath;

    public static String greating;
//    @Value("${message.instructions}")
//    public static String instructions;

    @Value("${message.greating}")
    public void setNameStatic(String name){
        Main.greating = name;
    }

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        PersonService service = context.getBean(PersonService.class);

        System.out.println(greating);


        Scanner sc = new Scanner(System.in);

        String ready = sc.nextLine();

        if(ready == "y"){




        }

    }
}
