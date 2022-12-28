package section1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        int x = 10;
        double y = 3.14;
        String S = "hELLO";
        System.out.println("x= " + x);
        y = y + 20 * x;
        if (y > 100) {
            System.out.println("y=" + y);
        } else {
            System.out.println("x= " + x);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("i=" + i);
        }


        //tinh tong 1+1/2+1/3+.....1/1000;
        //tinh tong 1+2+3+.....1000;

        double sum = 0;
        float sum1 = 0;
        for (int i=1;i<1000;i++){
            sum = sum + i;
        }
        System.out.println("sum="+sum);
        for (int i=1;i<=1000;i++){
            sum1 +=  (float) 1/i;
        }

        System.out.println("sum1="+sum1);

       int z = tinhtong(10 ,15);
        int h = tinhhieu(10 ,15);
       double j = tinhthuong(10 ,15);
        int k = tinhtich(10 ,15);
       System.out.println("z="+z);
        System.out.println("h="+h);
        System.out.println("j="+j);
        System.out.println("k="+k);

        //nhap mot so nguyen tu ban phim
        Scanner sc =new Scanner(System.in);

        int n= sc.nextInt();
        System.out.println("NHAP MOT SO THUC :");
        double d =sc.nextDouble();
        sc.nextLine();
        System.out.println("NHAP MOT CHUOI");
        String str=sc.nextLine();
        System.out.println("n="+n);
        System.out.println("d="+d);
        System.out.println("str="+str);

    }

    static int tinhtong(int a, int b){
        return a+b;
    }
    static  int tinhhieu(int a,int b){
        return a-b;
    }
    static  int tinhtich(int a,int b){
        return a*b;
    }
    static  int tinhthuong(int a,int b){
       return b==0?null:a/b;
    }
}
