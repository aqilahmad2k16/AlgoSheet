// public class Programmer extends Employee{
//     public static void main(String[] args){
//         Programmer emp = new Programmer();
//         System.out.println("this employee salary is "+ emp.salary);

//         System.out.println("total ctc of the emplyee "+ emp.getMonthalySalary());
//     }
// }

// class Employee{
//     float salary = 40000;
//     public int getMonthalySalary(){
//         return (int) (salary*10);
//     }
// }

// class Animal {

//     int rollNo;
//     String name;
//     Animal(){

//     }

//     Animal(int rollno, String name){
//         this.rollNo = rollno;
//         this.name = name;
//     }

//     void getValue(){
//         System.out.println("My roll no is "+ this.rollNo);
//         System.out.println("My name is "+ this.name);
//     }

//     void setValue(){
//         this.getValue();
//     }
    

//     // int id = 12;
// }

// class Dog extends Animal{
//     void  sound(){
//         System.out.println("dog is Barking");

//     }
//     // default int empId = 2135;
    
// }

// class Elephant extends Dog{
//     void eat(){
//         System.out.println("Elephant eats SugarCane");
//     }
// }

abstract class Shape{
    abstract void draw();
}

// in real scenario, Implementation is provided by the others i.e, unknown end users

class Rectangle extends Shape{
    void draw(){ System.out.println("drawing the rectangle");} // here, we are overriding the draw method of abstract class
}

class Circle extends Shape{
    void draw(){ System.out.println("Drawing the Circle");}
}

public class TestRun{

    // private int x = 31;
    // {
    //     System.out.println("value of x "+ x);
    // }
    public static void main(String[] args) {
    //    Animal a = new Animal(1253, "Aqil Ahmad");
    //    a.setValue();

    //    Dog d = new Dog();
    //    d.getValue();
    //    d.sound();

    //    Elephant e = new Elephant();
    //    e.eat();
        // TestRun t = new TestRun();
        Shape s  = new Rectangle();
        s.draw(); // here, we are overriding the draw method of the abstract shape class

        Shape s1=new Circle();
        s1.draw(); // here, we are doing the same.

        
      
    }
}