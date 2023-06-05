package com.training.studentspring.common;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.studentspring.bean.Student;
import com.training.studentspring.bean.HelloName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.DatagramPacket;

public class App {
        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("StudentSpringModule.xml");

            HelloName obj = (HelloName) context.getBean("helloBean");
            obj.printHello();
            // singleton,singleton

            Student stdObjOne = (Student) context.getBean("studentBean");
            String messageOne = stdObjOne.welcomeMessage();
            System.out.println("Welcome message in APP.java file .....:  "+messageOne);


            Student stdObjtwo = (Student) context.getBean("studentBean");
            String messagetwo = stdObjtwo.welcomeMessage();
            System.out.println("Welcome message in APP.java file .....:  "+messagetwo);


            System.out.println("Student objectone Hashcode: " +stdObjOne.hashCode());
            System.out.println("Student objecttwo Hashcode: " +stdObjtwo.hashCode());

            boolean isStudentOneequalsStudentTwo = stdObjOne.hashCode() == stdObjtwo.hashCode();
            System.out.println("Singleton hashcode equals: " +isStudentOneequalsStudentTwo);


            System.out.println("Address objectone Hashcode: " +stdObjOne.hashCode());
            System.out.println("Address objecttwo Hashcode: " +stdObjtwo.hashCode());

            boolean singletonAddressHashcodeCheck = stdObjOne.getAddress().hashCode() == stdObjtwo.getAddress().hashCode();
            System.out.println("SingletonAddress hashcode equals: " +singletonAddressHashcodeCheck);

            //prototype,prototype

            Student prototypestdObjOne= (Student) context.getBean("studentPrototypeBean");
            String messageone = prototypestdObjOne.welcomeMessage();

            Student prototypestdObjTwo= (Student) context.getBean("studentPrototypeBean");
            String messageTwo = prototypestdObjTwo.welcomeMessage();

            System.out.println("Welcome message in APP.java file .....:  "+messageTwo);
            System.out.println("Student objectone Hashcode: " +prototypestdObjOne.hashCode());
            System.out.println("Student objecttwo Hashcode: " +prototypestdObjTwo.hashCode());

            boolean isPrototypeStudentOneequalsStudentTwo = prototypestdObjOne.hashCode() == prototypestdObjTwo.hashCode();
            System.out.println("Prototype hashcode equals: " +isPrototypeStudentOneequalsStudentTwo);


            System.out.println("Address objectone Hashcode: " +prototypestdObjOne.getAddress().hashCode());
            System.out.println("Address objecttwo Hashcode: " +prototypestdObjTwo.getAddress().hashCode());

            boolean prototypeAddressHashcodeCheck = prototypestdObjOne.getAddress().hashCode() == prototypestdObjTwo.getAddress().hashCode();
            System.out.println("PrototypeAddress hashcode equals: " +prototypeAddressHashcodeCheck);

            //singleton,prototype

            Student singletontypestdObjOne= (Student) context.getBean("studentSingletontypeBean");
            String singletonmessageone = singletontypestdObjOne.welcomeMessage();

            Student singletontypestdObjTwo= (Student) context.getBean("studentSingletontypeBean");
            String singletonmessageTwo =  singletontypestdObjTwo.welcomeMessage();

            System.out.println("Welcome message in APP.java file .....:  "+messageTwo);
            System.out.println("Student objectone Hashcode: " +singletontypestdObjOne.hashCode());
            System.out.println("Student objecttwo Hashcode: " +singletontypestdObjTwo.hashCode());

            boolean isSingletontypeStudentOneequalsStudentTwo = singletontypestdObjOne.hashCode() == singletontypestdObjTwo.hashCode();
            System.out.println("Singleton hashcode equals: " +isSingletontypeStudentOneequalsStudentTwo);


            System.out.println("Address objectone Hashcode: " +prototypestdObjOne.getAddress().hashCode());
            System.out.println("Address objecttwo Hashcode: " +prototypestdObjTwo.getAddress().hashCode());

            boolean prototypeAddressHashcodeCheck1 = prototypestdObjOne.getAddress().hashCode() == prototypestdObjTwo.getAddress().hashCode();
            System.out.println("PrototypeAddress hashcode equals: " +prototypeAddressHashcodeCheck1);

            //prototype,singleton


            Student prototypestdObjOne1= (Student) context.getBean("studentPrototypeBean1");
            String prototypemessageone1 = prototypestdObjOne.welcomeMessage();

            Student prototypestdObjTwo1= (Student) context.getBean("studentPrototypeBean1");
            String prototypemessageTwo1=  prototypestdObjTwo.welcomeMessage();

            System.out.println("Welcome message in APP.java file .....:  "+messageTwo);
            System.out.println("Student objectone Hashcode: " +prototypestdObjOne1.hashCode());
            System.out.println("Student objecttwo Hashcode: " +prototypestdObjTwo1.hashCode());

            boolean isPrototypeStudentOneequalsStudentTwo1 = prototypestdObjOne1.hashCode() == prototypestdObjTwo1.hashCode();
            System.out.println("Prototype hashcode equals: " +isPrototypeStudentOneequalsStudentTwo1);


            System.out.println("Address objectone Hashcode: " +singletontypestdObjOne.getAddress().hashCode());
            System.out.println("Address objecttwo Hashcode: " +singletontypestdObjTwo.getAddress().hashCode());

            boolean isSingletonAddressHashcodeCheck1 = singletontypestdObjOne.getAddress().hashCode() == singletontypestdObjTwo.getAddress().hashCode();
            System.out.println("PrototypeAddress hashcode equals: " +isSingletonAddressHashcodeCheck1);
        }

    }
