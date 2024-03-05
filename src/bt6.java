import java.util.Scanner;

//Kiểm tra 1 số có chia hết cho 3 và 5
public class bt6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số cần kiểm tra");
        double num = Double.parseDouble(scanner.nextLine());
        String ketQua;
        if (num % 3 == 0 && num % 5 == 0) {
            ketQua = " chia hết cho cả 3 và 5";
        } else if (num % 3 == 0 && num % 5 != 0) {
            ketQua = " chỉ chia hết cho 3";

        } else if (num % 3 != 0 && num % 5 == 0) {
            ketQua = " chỉ chia hết cho 5";

        }
        else {
            ketQua = " Không chia hết cho 3 , cũng không chia hết cho 5";
        }
        System.out.println( " Số " +num + ketQua );
    }
}
