import java.util.Scanner;
class Homework2_2 {
    public static void main(String[] args) {
        System.out.print("==== 请输入一个数字n: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        printMatrix(num);

    }
    public static void printMatrix(int number){
        for(int i=0;i<number;i++){
            for(int j=0;j<number;j++)
                System.out.print((int)(Math.random()*2)+" ");
            System.out.print("\n");
        }
    }
}