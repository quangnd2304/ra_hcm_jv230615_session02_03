package loop;

import java.util.Scanner;

public class While_Demo {
    public static void main(String[] args) {
        //1. Sử dụng vòng lặp nhập và in 5 số chẵn từ bàn phím
        //VD: 2 5 6 8 7 10 4 --> kết thúc nhập và in ra 2 6 8 10 4
        Scanner scanner = new Scanner(System.in);
        int cntNumber = 0;
        System.out.println("Nhập vào các số nguyên");
        while (cntNumber<5){
            int number = Integer.parseInt(scanner.nextLine());
            if (number%2==0){
                cntNumber++;
                System.out.println(number);
            }
        }


    }
}
