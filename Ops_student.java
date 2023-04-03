
class Student {
    String name; //object er nam
    int age;

    public void printname() { //function
        System.out.println(this.name);
        System.out.println(this.age);


    }

    /*   Student() {           //apnacollegoops15:18
           System.out.println("constructor cAlled");
       }*/
    //   parameter name
/*       PARAMETER CONSTRUCTOR
Student(String name, int age) {           //apnacollegoops15:18
        // obj    = parameter/argument
        this.name = name;
        this.age = age;

    }*/
     //copy parameter
    Student(Student s2) {           //apnacollegoops18:18
        // obj    = parameter/argument
        this.name = s2.name;
        this.age = s2.age;

    }
    Student(){

    }
}
public class Ops_student {
    public static void main(String args[]){
        Student s1 = new Student();    //object
        s1.name = "hej";
        s1.age = 32;

        Student s2 = new Student(s1);    //object

        s2.printname();
    }
}

