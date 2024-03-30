package test;

import java.util.Scanner;

public class TotalNumberOfDays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]matrix=new int[2][3];
        int date=0;
        for(int i=0;i<2;i++) {
            for(int j=0;j<3;j++) {
                System.out.println("Enter the date");
                matrix[i][j]=sc.nextInt();
                System.out.println("Enter the month");
                matrix[i][j++]=sc.nextInt();
                System.out.println("Enter the year");
                matrix[i][j++]=sc.nextInt();
            }

        }
        for(int i=matrix[0][2];i<matrix[1][2];i++)
        {
           if(i%4==0 && (i % 100 != 0))
           {
               date+=366;
           }
           else if(i%400==0)
           {
               date+=366;
           }
           date+=365;
        }
        for(int i=matrix[0][1]+1;i<matrix[1][1]-1;i++)
        {
            if(i==2)
                date+=30;
            else if (i%2==0)
            date+=30;
            else
                date+=31;
        }
        System.out.println(date+matrix[0][0]+matrix[0][0]);
    }
}
