import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        String name="";
        int n;

        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();

        n = sc.nextInt();

        if(name.length()%n==0)
        {
            int a=name.length()/n;
            for (int i=0;i<name.length();i++) {

                System.out.print(name.charAt(i));
                if((i+1)%a==0)
                {
                    System.out.println("");
                }

            }
        }



    }
}
