import java.util.Scanner;
class Homework2_1 {
    public static void main(String[] args) {
        System.out.print("==== 请输入一串数字: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        reverse(num);

    }
    public static void reverse(int number){
        String str = String.valueOf(number);
        char a[] = new char[str.length()];//开辟一维数组。PS：字符串的.length()要加（）
        for(int i=0;i<str.length();i++){//存入数组
            a[i]=str.charAt(i);
        }
        System.out.print("==== 反转后的数字是: ");
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(a[i]);
        }
        return;
    }
}