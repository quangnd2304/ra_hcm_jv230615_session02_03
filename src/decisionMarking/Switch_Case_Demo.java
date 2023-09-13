package decisionMarking;

import java.util.Scanner;

public class Switch_Case_Demo {
    public static void main(String[] args) {
        //Phiên âm các số từ 0-9 nhập từ bàn phím: 1 - Một
        //Bước 1: Nhập một số từ bàn phím - number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên từ 0-9:");
        int number = Integer.parseInt(scanner.nextLine());
        //Bước 2: switch theo number và in ra chữ phiên âm của số
        //Sử dụng case: 10 trường hợp --> 9 case + 1 default
        switch (number){
            case 0:
                System.out.println("Không");
                break;
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            default:
                System.out.println("Chín");
        }
    }
}
