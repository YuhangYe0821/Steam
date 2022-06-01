import java.util.Scanner;

public class steam {
    public static void main(String[] args) {
        double num1;//买入价
        double num2;//steam挂售价
        double num3;//steam求购价
        double result1;//挂售比例
        double result2;//求购比例
        double result3;//挂售到手
        double result4;//求购到手
        Scanner input=new Scanner(System.in);
        while(true){//死循环
            System.out.println("买入:");//buy
            num1=input.nextDouble();//输入购入价
            System.out.println("卖出(挂售):");//sell
            num2=input.nextDouble();//输入steam售价
            System.out.println("卖出(求购):");//sell
            num3=input.nextDouble();//输入steam售价
            result1=num1/(num2/1.15);//挂售比例
            result2=num1/(num3/1.15);//挂售比例
            result3=num2/1.15;//挂售到手
            result4=num3/1.15;//求购到手
            System.out.println("挂售比例："+result1);//输出比例proportion
            System.out.println("求购比例："+result2);//输出比例proportion
            System.out.println("挂售到手："+result3);//输出到手Get
            System.out.println("求购到手："+result4);//输出到手Get
            System.out.println();//换行
        }
    }
}