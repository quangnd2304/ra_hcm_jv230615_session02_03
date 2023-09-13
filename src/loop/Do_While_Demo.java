package loop;

import java.util.Scanner;

public class Do_While_Demo {
    public static void main(String[] args) {
        /*
        * In ra menu của cửa hàng cafe
        * *******MENU**********
        * 1. Cafe sữa
        * 2. Cafe Đen
        * 3. Sinh tố xoài
        * 4. Sinh tố bơ
        * 5. Kết thúc
        * Sự lựa chọn của bạn:
        * Khi khách hàng chọn đồ uống, in ra Bạn vừa chọn ....
        * Khi khách hàng chọn 5, chương trình kết thúc
        * */
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            //In menu
            System.out.println("*************MENU********************");
            System.out.println("1. Cafe sữa");
            System.out.println("2. Cafe đen");
            System.out.println("3. Sinh tố xoài");
            System.out.println("4. Sinh tố bơ");
            System.out.println("5. Kết thúc");
            System.out.print("Sự lựa chọn của bạn:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Bạn vừa chọn cafe sữa");
                    break;
                case 2:
                    System.out.println("Bạn vừa chọn cafe đen");
                    break;
                case 3:
                    System.out.println("Bạn vừa chọn sinh tố xoài");
                    break;
                case 4:
                    System.out.println("Bạn vừa chọn sinh tố bơ");
            }
        }while(choice!=5);
    }
}
