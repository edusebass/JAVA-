//
public class main { 
    public static void main(String[] args) {
        System.out.println("Hello world");
        //FIRST OBJECT CREATED
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "Anuj";
        //SECOND OBJECT CREATED
        Person p2 = new Person();
        p2.age = 30;
        p2.name = "Eduardo";
        //CALLED TO THE OBJECT PERSON
        System.out.println(p1.age + " " + p1.name);
        System.out.println("This is the " + p2.age + " " + p2.name);
        
    }
}

//CLASS PERSON WHERE I PUT THE OBJECTS THIS CONTAINED
class Person {
        String name;
        int age;
    }
