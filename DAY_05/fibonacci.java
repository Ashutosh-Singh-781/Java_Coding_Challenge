public class fibonacci {
    public static void main(String[] args) {
        // 5=0 1 1 2 3 5
        int a=10;
        int b=0;
        int c=1;
        System.out.print(b+" "+c);
        for (int i=2;i<a;i++){
        int d=b+c;
        System.out.print(" "+d);
        b=c;
        c=d;
    }


    }
    
}
