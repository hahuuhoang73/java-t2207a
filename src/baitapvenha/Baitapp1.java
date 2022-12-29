package baitapvenha;

import java.util.Scanner;

public class Baitapp1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Nhap vao so tu nhien :");
        int n = sn.nextInt();
        int Sum = 0;
        for (int i=1;i<n;i++){
            if (n%i==0){
                Sum+=i;
                System.out.println(n +  " chia het cho " + i);
            }
        }
        if (Sum==n){
            System.out.println(n + " la so HOAN HAO");
        }else {
            System.out.println(n + " KO la so HOAN HAO");
        }


    }
}
