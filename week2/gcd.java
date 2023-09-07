import  java.util.Scanner;
public class gcd {
    public static void  main(String [] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int x = get_ged(a,b);
        System.out.println(x);

    }
    public static int get_ged(int a,int b) {
        if (b == 0)
            return a;

        else
            return get_ged(b,a%b);
    }

}
