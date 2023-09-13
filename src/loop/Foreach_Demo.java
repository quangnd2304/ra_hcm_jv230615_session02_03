package loop;

import java.util.ArrayList;
import java.util.List;

public class Foreach_Demo {
    public static void main(String[] args) {
        int[] arrInt = {2, 4, 6, 8, 10};
        //In ra các phần tử trong mảng
        System.out.println("Các phần tử trong mảng là: ");
        for (int element : arrInt) {
            System.out.printf("%d\t",element);
        }
        System.out.printf("\n");
        //In ra các phần tử trong mảng sử dụng foreach của java 8
        List<Integer> listInt = new ArrayList<>();
        listInt.add(3);
        listInt.add(5);
        listInt.add(7);
        listInt.add(9);
        System.out.println("Các phần tử trong mảng theo java-8");
        //Java-8: stream + lambda
        listInt.forEach(element-> System.out.printf("%d\t",element));

    }
}
