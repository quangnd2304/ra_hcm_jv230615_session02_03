package loop;

public class For_Demo {
    public static void main(String[] args) {
        //In ra các số chẵn từ 1 đến 10
        System.out.println("Các số chẵn trong khoảng 1-10 là:");
        for (int i = 1; i < 10; i++) {
            if (i%2==0){
                System.out.printf("%d\t",i);
            }
        }
        System.out.printf("\n");
        //In ra điểm trung bình trong khoảng 0-10: sử dụng vòng for
        int i,j;
        for (i = 0,j=10; i < j; i++,j--) {
            System.out.printf("i=%d, j=%d\n",i,j);
        }
        System.out.println("Điểm trung bình trong khoảng 0-10 là: "+i);
    }
}
