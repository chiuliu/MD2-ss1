import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập chiều dài");
        int a  = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập chiều rộng");
        int b  = Integer.parseInt(scanner.nextLine());
        int cv = (a+b)*2;
        int dt = a*b;
        System.out.println("Diện tích là " +dt);
        System.out.println("chu vi là " +cv);


    }
}
