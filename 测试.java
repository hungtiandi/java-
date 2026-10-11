package 第二阶段;
import java.util.Random;
import java.util.Scanner;
public class 测试 {
    public static   void main(String[] args) {
             Random r=new Random();
             int answer=r.nextInt(100)+1;
             Scanner sc=new Scanner(System.in);
             int count=1;
             System.out.println("请输入你要猜的数字");
             int guss=sc.nextInt();
             while (guss!=answer){
                 if(guss>answer){
                     System.out.println("猜大了");}
                     else if(guss<answer){
                         System.out.println("猜小了");
                         }
                 System.out.println("请再输入一遍");
                     guss=sc.nextInt();
                     count++;


             }
                 System.out.println("恭喜你，猜对了"+count+"次");



    }
}
