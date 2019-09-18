package org.fasttrackit;

public class LogicalOp {

    public void exercise1(int a){

        if (a < 100)
            for(int i = a;i <= 100; i++)
            {

                System.out.println(i);

            }


    }

    public void exercise2(int a){

        if (a > -100)
            for(int i = a;i >= -100; i--)
                System.out.println(i);

    }

    public void exercise3(int a, int b){


        if(a < b)
            for(int i = a;i <= b;i++)
                System.out.println(i);
            else if(b <a)
            for(int i = a;i >= b;i--)
                System.out.println(i);
            else
            System.out.println("They are equal");

    }

    public void exercise5(){

        for(int i = 2;i <=100;i = i + 2)
            System.out.println(i);

    }

    public void exercise6(){

        for(int i =1;i<100;i+=2)
            System.out.println(i);

    }

    public int exercise7(int a){
        int b = 0;
        for(int i = a;i < 100;i++)
            b = b+i;
        return b;

    }

    public int exercise8(int a) {
        int b = 0, media = 0, n = 0;
        for (int i = a; i < 100; i++) {
            b = b + i;
            n++;
        }
        return b / n;

    }

    public void exercise9(){


        for(int j = 7;j > 0 ;j--){
        for(int i = j;i > 0;i--)
            System.out.print("*");
            System.out.println();
        }

    }

    }
