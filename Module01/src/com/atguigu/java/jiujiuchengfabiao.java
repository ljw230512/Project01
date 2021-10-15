package com.atguigu.java;

import java.util.Scanner;

public class jiujiuchengfabiao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        test(item);

    }
    public static void test(int n){
        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
