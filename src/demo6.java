// Nhập vào 1 ký tự
//Kiểm tra xem số đó là nguyên âm hay phụ âm

import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        // Khởi tạo một đối tượng Scanner để đọc dữ liệu từ bàn phím
         Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào một ký tự");
        String chu = scanner.nextLine();
        // Kiểm tra ký tự đó có phải nguyên âm hay không
        switch (chu){
            case "u" :
                System.out.println("số  " +chu + "là số nguyên âm ");
                break;
            case "e" :
                System.out.println("số  " +chu + "là số nguyên âm ");
                break;
            case "o" :
                System.out.println("số  " +chu + "là số nguyên âm ");
                break;
            case "a" :
                System.out.println("số  " +chu + "là số nguyên âm ");
                break;
            case "i" :
                System.out.println("số  " +chu + "là số nguyên âm ");
                break;
            default:
                System.out.println("phụ âm");
        }


    }
}
