package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();//0
        int v1 = in.nextInt();//3
        int x2 = in.nextInt();//4
        int v2 = in.nextInt();//2

        if(x2>x1 && v2> v1){
            System.out.println("NO");
        }else{
                for(int i=1;i>0;i++)
                {if(x2 > x1) {
                    x2 = x2 + v2;
                    x1 = x1 + v1;

                    if (x1 == x2) {
                        System.out.println("YES");
                        break;
                    }

                    if (x1 > x2) {
                        System.out.println("NO");
                        break;
                    }
                }
            }
        }

    }
}
