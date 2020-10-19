import java.util.Scanner;
import javax.xml.crypto.dsig.spec.*;
import java.awt.image.*;

public class Homework2_4 {
    public static void main(String[] args) {
        System.out.print("请输入十个数字（以空格键分隔，回车键结束）: \n");
        Scanner input = new Scanner(System.in);
        double a[] = new double[10];
        for(int i=0;i<10;i++){
            a[i]=input.nextInt();
        }
        System.out.print("您输入的最小数字的下标是："+indexOfSmallestElement(a));//注意这里虽然a是数组，但在调用函数时，在括号内不写后面的「[]」中括号；


    }

    public static int indexOfSmallestElement(double[] array){
        int num=0;
        for(int i=1;i<10;i++){
            if(array[i]<array[num]){
                num = i;
            }
        }
        return num;
    }
}