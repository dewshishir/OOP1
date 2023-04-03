import java.util.Scanner;

public class Switch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("adult");
                break;
            case 2:
                System.out.println("not adult");
                break;
            default:
                System.out.println("trans");
        }
    }
}
