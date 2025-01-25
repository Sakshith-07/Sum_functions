import java.util.Scanner;
public class SumFunc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum=add(n1,n2);
        System.out.println("the sum is "+ sum);
        sc.close();
    }
    public static int add(int n1, int n2){
        return n1+n2;
    }
        
}