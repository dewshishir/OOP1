import java.util.Scanner;

public class Funin {

        public static int printMy(int c,int d){
            int jog = c+d;
            return jog;
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum=printMy(a,b);
            System.out.println("sum of 2 num: "+sum);
        }
    }


