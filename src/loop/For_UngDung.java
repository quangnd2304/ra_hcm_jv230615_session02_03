package loop;

import java.util.Scanner;

public class For_UngDung {
    public static void main(String[] args) {
        /*
        * Nhập vào một số nguyên từ bàn phím, Kiểm tra số nguyên có
        * phải là số nguyên tố hay không
        * */
        //Số nguyên tố chỉ ước là 1 và chính nó
        //Số nguyên tố có giá trị >=2
        //Bước 1: Nhập vào số nguyên
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên:");
        int number = Integer.parseInt(scanner.nextLine());
        //Bước 2: Kiểm tra số nguyên tố
        boolean isPrime = true;//true: số nguyên tố - false: không phải số nguyên tố
        if (number>=2){
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number%i==0){
                    //i là ước số ngoài 1 và number của số number--> number không phải là số nguyên tố
                    isPrime=false;
                    break;//Thoát khỏi vòng for
                }
            }
        }else{
            isPrime = false;
        }
        if (isPrime){
            System.out.printf("%d là số nguyên tố\n",number);
        }else{
            System.out.printf("%d không phải là số nguyên tố\n",number);
        }
    }
}
