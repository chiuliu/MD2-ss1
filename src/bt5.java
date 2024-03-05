import java.util.Scanner;

//tính điểm trung bình các môn
public class bt5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập điểm môn Toán : ");
        Double math = Double.valueOf(scanner.nextLine());
        System.out.println("Mời bạn nhập điểm môn Vật Lý : ");
        Double physics = Double.valueOf(scanner.nextLine());
        System.out.println("Mời bạn nhập điểm môn Hóa Học : ");
        Double chemistry = Double.valueOf(scanner.nextLine());
        System.out.println("Mời bạn nhập điểm môn Văn Học : ");
        Double literature = Double.valueOf(scanner.nextLine());
        System.out.println("Mời bạn nhập điểm môn Anh : ");
        Double english = Double.valueOf(scanner.nextLine());
        Double average = (math + physics + chemistry + literature + english) / 5;
        String hocluc;
        if (average >= 9) {
            hocluc = "Xuất Sắc";
        } else if (average >= 8) {
            hocluc = "Giỏi";
        } else if (average >= 6.5) {
            hocluc = "Khá";
        } else if (average >= 5) {
            hocluc = "Trung Bình";
        } else {
            hocluc = "Yếu";
        }
        // Ket qua
        System.out.println("Diểm trung bình môn học là " + average);
        System.out.println("Học lực " + hocluc);


    }
}