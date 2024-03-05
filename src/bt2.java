import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số USD muốn quy đổi là : "  );
        int changeUSD = Integer.parseInt(scanner.nextLine());
        int changeVND = changeUSD * 23000;

        System.out.println("Tỉ lệ giá ra VNĐ là : " +changeVND);
    }
}
