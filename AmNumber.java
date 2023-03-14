import java.util.Scanner;

public class AmNumber {

    public static void main(String[] args) {
        System.out.println("type Your Number here");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int square = n*n;

        while(n>0)
        {
            if(n%10!=square%10)
            {
                System.out.println("This is not AM number");
            }
            n =n/10;
            square=square/10;

        }

    }

}
