/*
Requirements to project: create classes;
- the class must have constructors, attributes, methods;
- implementation of getter and setter methods;
- create instances of classes in the main function;
- output them to console, compare multiple objects.
*/
import java.lang.String;
import java.util.Scanner;
public class Assignment1 {
    public static class Animal {
        private String diet; //Creation of Attributes
        private int age; //Creation of Attributes
        private String kind; //Creation of Attributes
        private String name; //Creation of Attributes
        public Animal(String diet, int age, String kind, String name) { //Creation of Constructor
            this.diet = diet;
            this.age = age;
            this.kind = kind;
            this.name = name;
        }
        public void getInfo() { //Creation of Getter
            System.out.print("Animal's name is " + name + ", its age is " + age + ", it is " + kind + " and eats only " + diet + ".\n");
        }
        public void setAge(int age) { //Creation of Setter
            this.age = age;
        }
        public void setName(String name) { //Creation of Setter
            this.name = name;
        }
        public void setKind(String kind) { //Creation of Setter
            this.kind = kind;
        }
        public void setDiet(String diet) { //Creation of Setter
            this.diet = diet;
        }
    }
    public static class Zookeeper {
        private int age; //Creation of Attributes
        private String gender; //Creation of Attributes
        private String name; //Creation of Attributes
        private int work_years; //Creation of Attributes
        public Zookeeper(int age, String gender, String name, int work_years) { //Creation of Constructor
            this.age = age;
            this.gender = gender;
            this.name = name;
            this.work_years = work_years;
        }
        public void getInfo() { //Creation of Getter
            System.out.print("Zookeeper's name is " + name);
            if(gender == "female") {
                System.out.print(", her ");
            } else {
                System.out.print(", his ");
            }
            System.out.print("gender and age are " + gender + " and " + age + " respectively, and the Zookeeper works here for " + work_years + " years.\n");
        }
        public void setAge(int age) { //Creation of Setter
            this.age = age;
        }
        public void setName(String name) { //Creation of Setter
            this.name = name;
        }
        public void setWork_years(int work_years) { //Creation of Setter
            this.work_years = work_years;
        }
        public void setGender(String gender) { //Creation of Setter
            this.gender = gender;
        }
    }
    public static class Zoo {
        private String name; //Creation of Attributes
        public Zoo(String name) { //Creation of Constructor
            this.name = name;
        }
        public void getInfo() { //Creation of Getter
            System.out.print("This Zoo's name is " + name + ".\n");
        }
        public void setName(String name) { //Creation of Setter
            this.name = name;
        }
    }
    public static void main(String argc[]) {
        Animal zebra = new Animal("plants", 3, "mammal", "Terry"); //Creation of instances of Classes
        Animal lion = new Animal("meat", 6, "mammal", "Simba"); //Creation of instances of Classes
        Zookeeper officher = new Zookeeper(34, "male", "John", 5); //Creation of instances of Classes
        Zookeeper collonel = new Zookeeper(46, "male", "Bill", 10); //Creation of instances of Classes
        Zoo zoo1 = new Zoo("Freedom"); //Creation of instances of Classes
        Zoo zoo2 = new Zoo("Aurelia"); //Creation of instances of Classes
        zebra.getInfo(); //Output of instances in Console
        officher.getInfo(); //Output of instances in Console
        zoo1.getInfo(); //Output of instances in Console
        if(zebra.equals(lion)) { //Comparing multiple objects
            System.out.println("Both animals are the same!");
        } else {
            System.out.println("They are completely different animals.");
        }
        if(officher.equals(collonel)) { //Comparing multiple objects
            System.out.println("Both warriors are the same person!");
        } else {
            System.out.println("They are completely different people.");
        }
        if(zoo1.equals(zoo2)) { //Comparing multiple objects
            System.out.println("Both zoos are the same places!");
        } else {
            System.out.println("They are completely different places.");
        }
    }
}