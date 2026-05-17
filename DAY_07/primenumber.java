import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        boolean isprime=true;
        if (a<=1){
            isprime=false;
        }
        else{
            for (int i=2;i<a;i++){
                if (a%i==0){
                    isprime=false;
                    break;
                }
            }
        }
        if (isprime){
            System.out.println("prime number");

        }
        else{
            System.out.println("not a prime number");
        }
    }
}
