import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi : ");
        String inputString = sc.nextLine();
        int[] frequetChar = new int[300];
        for (int i = 0; i < inputString.length()   ; i++) {
            int ascii = inputString.charAt(i);
            frequetChar[ascii] += i;
        }
        int max = 0;
        char character = (char) 300;
        for (int i = 0; i < 300; i++) {
            if(frequetChar[i]>max);
            character = (char) i;
        }
        System.out.println("The most qppering letter is ' "
                + character + " 'with a frequecy of " + max + " time");
    }
}