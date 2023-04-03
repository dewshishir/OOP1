class Studnt {
    String name; //object er nam
    int age;
    //polymorfizom
    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name,int age){
        System.out.println(name +" "+ age);
    }

}
public class Oops_poly {
    public static void main(String args[]){
        Studnt s1 = new Studnt();    //object
        s1.name = "hej";
        s1.age = 32;
        s1.printinfo(s1.name,s1.age);
    }
}