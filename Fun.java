import java.util.Scanner;

public class Fun {
    public static void printMy(String nam){
        System.out.println(nam);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMy(name);
    }
}
