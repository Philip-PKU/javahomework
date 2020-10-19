import java.util.Scanner;
import java.text.DecimalFormat;//用于自己确定保留小数点后几位

class Untitled {
    public static void main(String[] args) {
        System.out.print("请输入一个4x4的矩阵（以空格键分隔，回车键换行）: \n");
        Scanner input = new Scanner(System.in);
        double a[][] = new double[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                a[i][j]=input.nextDouble();
            }
        }
        double num = sumMajorDiagonal(a);
        DecimalFormat df = new DecimalFormat("0.0");//保留小数点后一位
        String n = df.format(num);

        System.out.print("Sum of the elements in the major diagonal is "+n);
    }

    public static double sumMajorDiagonal(double[][] array){
        double num = 0;
        for(int i=0; i<4; i++){
            num+=array[i][i];
        }
        return num;
    }
}