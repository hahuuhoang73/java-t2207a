package baitapvenha;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Nhap vao so tu nhien :");
        int n = sn.nextInt();
        int h = Pibonaci(n);
        System.out.println("so PIBONACI thu n cua "+n+" la :"+h);


    }
    static int Pibonaci(int n) {


        int a1=1,a2=1;
        if (n==1 || n==2)
            return 1;
//        int i=3,a;
//        while (i<=n){
//            a = a1 + a2;
//            a1=a2;
//            a2=a;
//            i++;
//        }
        return Pibonaci(n-1)+Pibonaci(n-2);
    }
}
