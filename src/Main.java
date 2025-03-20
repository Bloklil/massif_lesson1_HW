import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] smollBox = new int[6]; //массив 1
        for (int i = 0; i < smollBox.length; i++) {
            smollBox[i] = i + 1;
        }
        float[] box = {1.57f, 7.654f, 9.986f}; //массив 2
        int[] bigBox = {5, 8, 1, 0, 16, 19};   // массив 3
        System.out.println("Задание 2");
        for (int i = 0; i < smollBox.length; i++) {
            if (i == smollBox.length - 1) {
                System.out.println(smollBox[i]);
                break;
            }
            System.out.print(smollBox[i] + ", ");
        }
        for (int i = 0; i < box.length; i++) {
            if (i == box.length - 1) {
                System.out.println(box[i]);
                break;
            }
            System.out.print(box[i] + ", ");
        }
        for (int i = 0; i < bigBox.length; i++) {
            if (i == bigBox.length - 1) {
                System.out.println(bigBox[i]);
                break;
            }
            System.out.print(bigBox[i] + ", ");
        }
        System.out.println("Задание 3");
        for (int i = smollBox.length - 1; i >= 0; i--) {
            System.out.print(smollBox[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = box.length - 1; i >= 0; i--) {
            System.out.print(box[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = bigBox.length - 1; i >= 0; i--) {
            System.out.print(bigBox[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.println("Задание 4");
        for (int i = 0; i < smollBox.length; i++) {
            if (smollBox[i] % 2 != 0) {
                smollBox[i] += 1;
            }
        }
        System.out.println(Arrays.toString(smollBox));

    }
}
