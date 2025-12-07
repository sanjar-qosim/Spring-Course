package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog dog = context.getBean("myPet", Dog.class);
        Dog dog2 = context.getBean("myPet", Dog.class);
//
        System.out.println("Var links to one object: " + (dog2 == dog));
        System.out.println(dog);
        System.out.println(dog2);
//
//        dog.setName("Belka");
//        dog2.setName("Strelka");
//        System.out.println(dog.getName() + " " + dog2.getName());

        context.close();
    }
}
