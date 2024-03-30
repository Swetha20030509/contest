package test;

import java.util.Scanner;

public class Trainschedule {
    public void findTotaltrainNeed(int scheduleA[][],int scheduleB[][])
    {
        int trainAcount=scheduleA.length;
        int trainBcount=scheduleB.length;
        for(int i=0;i<scheduleA.length;i++)
        {
            for(int j=0;j<scheduleB.length;j++)
            {
                if(scheduleA[i][0]>scheduleB[j][1]&&scheduleB[j][1]>0&&scheduleA[i][0]!=-1)
                {
                    scheduleA[i][0]=-1;
                    scheduleB[j][1]=-1;
                    trainAcount--;
                }

            }

        }
        System.out.println(trainAcount);
        for(int i=0;i<scheduleB.length;i++)
        {
            for(int j=0;j<scheduleA.length;j++)
            {


                if(scheduleB[i][0]>scheduleA[j][1]&&scheduleA[j][1]!=-1&&scheduleB[i][0]!=-1)
                {
                    scheduleB[i][0]=-1;
                    scheduleA[j][1]=-1;
                    trainBcount--;
                }

            }
        }
        System.out.println(trainBcount);

    }
    public int convertMintues(String Time)
    {
        int time=0;
        String hourMin[]=Time.split(":");

        try
        {
            time+=(Integer.parseInt(hourMin[0])*60)+Integer.parseInt(hourMin[1]);
        }
        catch(Exception e)
        {
            System.out.println("Invalid");
        }
        if(time<1440)
            return time;
        else
            return 0;
    }
    public static void main(String args[])
    {
        Trainschedule obj=new Trainschedule();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the train departs from A");
        int tD1=sc.nextInt();
        System.out.println("Enter the train departs from B");
        int tD2=sc.nextInt();
        int scheduleA[][]=new int[tD1][2];
        int scheduleB[][]=new int[tD2][2];
        System.out.println("Train schedule from A");
        sc.nextLine();
        int t1=0;
        for(int i=0;i<tD1;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println("Enter the Arrival time");
                t1=obj.convertMintues(sc.nextLine());
                if(t1!=0)
                {
                    scheduleA[i][j++]=t1;
                }
                else
                {
                    System.out.println("Invalid");
                    break;
                }
                if(t1!=0)
                {
                    System.out.println("Enter the departs time");
                    t1=obj.convertMintues(sc.nextLine());
                    if(t1!=0)
                    {
                        scheduleA[i][j++]=t1;
                    }
                    else
                    {
                        System.out.println("Invalid");
                        break;
                    }
                }
            }
        }
        System.out.println("Train schedule from B");
        if(t1!=0)
        {
            for(int i=0;i<scheduleB.length;i++)
            {
                for(int j=0;j<2;j++)
                {
                    System.out.println("Enter the Arrival time");
                    t1=obj.convertMintues(sc.nextLine());
                    if(t1!=0)
                    {
                        scheduleB[i][j++]=t1;
                    }
                    else
                    {
                        System.out.println("Invalid");
                        break;
                    }
                    if(t1!=0)
                    {
                        System.out.println("Enter the departs time");
                        t1=obj.convertMintues(sc.nextLine());
                        if(t1!=0)
                        {
                            scheduleB[i][j++]=t1;
                        }
                        else
                        {
                            System.out.println("Invalid");
                            break;
                        }
                    }
                }
            }
            obj.findTotaltrainNeed(scheduleA,scheduleB);
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
