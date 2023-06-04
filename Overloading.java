class Student{
    String name;
    int age;
    public void printinfo(String name){
        System.out.println("Polymorphism with one variable (Name)");
        System.out.println("Name is : "+name);
    }
    public void printinfo(int age){
        System.out.println("Polymorphism with one variable (Age)");
        System.out.println("Age is : "+age);
    }
    public void printinfo(String name,int age){
        System.out.println("Polymorphism with two variables (Age and Name)");
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
    }
  
}

public class Overloading{
    public static void main(String args[]){

        Student s=new Student();
        s.name="Abc";
        s.age=19;
        s.printinfo(s.name,s.age);
        s.printinfo(s.name);
        s.printinfo(s.age);

    }
}