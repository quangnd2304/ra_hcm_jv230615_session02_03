package decisionMarking;

import java.util.Scanner;

public class If_ElseIf_Else_Demo {
    public static void main(String[] args) {
        //1. Nhập vào 1 số nguyên, in ra số nguyên là số chẵn hay lẻ
        //B1: Nhập vào 1 số nguyên
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên:");
        int number = Integer.parseInt(scanner.nextLine());
        //B2: Sử dụng câu lệnh điều kiện if...elseif...else --> 1 if 1 else
        if (number % 2 == 0) {
            System.out.printf("%d là số chẵn\n", number);
        } else {
            System.out.printf("%d là số lẻ\n", number);
        }
        //2. In ra các số dư trong phép chia 3 --> chia hết, dư 1, dư 2 --> 3 trường hợp
        //Sử dụng câu lệnh if --> 1 if, 1 else if, 1 else
        if (number % 3 == 0) {
            System.out.printf("%d chia hết cho 3\n", number);
        } else if (number % 3 == 1) {
            System.out.printf("%d chia 3 dư 1\n", number);
        } else {
            System.out.printf("%d chia 3 dư 2\n", number);
        }
        //3. In ra các số dư trong phép chia 4 --> dư 0, dư 1, dư 2, dư 3 --> 4 trường hợp
        //Các mệnh đề if: 1 if, 2 else if, 1 else
        if (number%4==0){
            System.out.printf("%d chia hết cho 4\n",number);
        } else if (number%4==1) {
            System.out.printf("%d chia 4 dư 1\n",number);
        } else if (number%4==2) {
            System.out.printf("%d chia 4 dư 2\n",number);
        }else{
            System.out.printf("%d chia 4 dư 3\n",number);
        }
    }
}
