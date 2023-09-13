package jump;

public class JumpDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 4) {
                break;
            }
            System.out.println("Giá trị i: " + i);
        }
        JumpDemo jd = new JumpDemo();
        System.out.println("Tổng hai số 3 và 5 là:" + jd.addNumber(3, 5));
    }

    public int addNumber(int number1, int number2) {
        int total = number1 + number2;
        return total;
    }
}
