public class Person {
    String name;
    int age;
    double experience;
    public Person(){}
    public Person(String nameOfPerson, int ageOfPerson, double experienceOfWork){
        name = nameOfPerson;
        age = ageOfPerson;
        experience = experienceOfWork;
    }
    void sayName(){
        System.out.println("My name is " + name + ", I'm " + age + " years old.");
    }
}
