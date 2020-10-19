import java.util.Scanner;
import javax.xml.crypto.dsig.spec.*;

class Homework2_3 {
    public static void main(String[] args) {
        System.out.print("首先生成100个0～9之间的随机整数: \n");
        int a[] = new int[100];
        int k = 0,count = 100;
        //100个数字入数组
        while(count>0){
            a[k]=(int)(Math.random()*10);
            count--;
            k++;
        }
        k=0;
        //仅用于显示和打印，方便用户观看
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(a[k] + "  ");
                k++;
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        k=0;
        //开始扫描计数
        int c0=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
        while(k<100){
            switch(a[k]){
                case 0 : c0++;
                    k++;
                    break;
                case 1 : c1++;
                    k++;
                    break;
                case 2 : c2++;
                    k++;
                    break;
                case 3 : c3++;
                    k++;
                    break;
                case 4 : c4++;
                    k++;
                    break;
                case 5 : c5++;
                    k++;
                    break;
                case 6 : c6++;
                    k++;
                    break;
                case 7 : c7++;
                    k++;
                    break;
                case 8 : c8++;
                    k++;
                    break;
                case 9 : c9++;
                    k++;
                    break;

            }
        }
        System.out.print("0出现的次数是：" + c0 + "次\n");
        System.out.print("1出现的次数是：" + c1 + "次\n");
        System.out.print("2出现的次数是：" + c2 + "次\n");
        System.out.print("3出现的次数是：" + c3 + "次\n");
        System.out.print("4出现的次数是：" + c4 + "次\n");
        System.out.print("5出现的次数是：" + c5 + "次\n");
        System.out.print("6出现的次数是：" + c6 + "次\n");
        System.out.print("7出现的次数是：" + c7 + "次\n");
        System.out.print("8出现的次数是：" + c8 + "次\n");
        System.out.print("9出现的次数是：" + c9 + "次\n");
    }
}