package baitapvenha;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("NHAP VAO SO a :");
        int a = sn.nextInt();
        System.out.println("NHAP VAO SO b :");
        int b = sn.nextInt();
        int ucln = UCLN(a,b);
        int bcnn = BCNN(a,b);
        System.out.println("ucln cua "+a+" va "+b+" la :"+ucln);
        System.out.println("bcnn cua "+a+" va "+b+" la :"+bcnn);


    }
    static int UCLN(int a, int b){
        if (a==0 || b==0){
            return a+b;
        }
        while (a!=b){
            if (a>b){
               a-=b;
            }else {
                b-=a;
            }
        }
               return a;
//        while (a*b !=0){
//            if (a>b){
//                a%=b;
//            }else {
//                b%=a;
//            }
//        }
//        return a+b;
    }
    static int BCNN(int a,int b){
        return (a*b)/UCLN(a,b);
    }
}
