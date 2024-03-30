package test;
import java.util.Scanner;

public class Multiple {
    public static float mul(int num,float a)
    {
        float result=0;
        for(int i=0;i<num;i++)
        {
            result+=a;
        }
        return result;
    }
    public static int divide(int num)
    {
        int count=0;
        while(num>=16)
        {
            num=num-16;
            count++;
        }
        System.out.println(num);
        return count;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int num= sc.nextInt();
       float mulitpleNum=0;
        if((num&1)==0)
        {
            System.out.println("multiplication :"+mul(num,7.5f));
            System.out.println("Calculate vlue"+mul(15,(int)divide(num)));
        }
        else {
            System.out.println("multiplication :"+mul(num,15.0f));
            System.out.println("Calculate vlue"+mul(15,(int)divide(num)));
        }

    }
}
