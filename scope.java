

public class scope {
    static int globaln= 6;
    public static void main(String[] args) {
        int localn=5;
        System.out.println("local "+ localn);
        System.out.println("globaln"+ globaln);   }    
        static void testScope() {
         //System.out.println(localn); // ERROR: localVar not visible here

        System.out.println("Accessing global variable in another method: " + globaln);
    }
}
