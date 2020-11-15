import java.util.Scanner;

public class ChineseRemainder {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int[] a = new int[50];
        a[0]=sc.nextInt();
        int[] b=new int[50];
        b[0] = sc.nextInt();
        int M = 90;

        System.out.println("Enter the number of factors of M");
        int M_no=sc.nextInt();
        System.out.println("Enter the factors");
        int[] m=new int[50];
        m[]=sc.nextInt();
        for(int i=0;i<M_no;i++)
        int[] m=new int[50];
        int[] d=new int[50];
        int[] e=new int[50];


        for(int i=0;i<M_no;i++){
            d[i]=((a[i]%m[i])+(b[i]%m[i]))%m[i];

            e[i]=((a[i]%m[i])*(b[i]%m[i]))%m[i];
        }

    }
}
