import java.util.Scanner;
 
public class AppBai3 {
 
    public static void main(String[] args) {
        int age, year;
        String name, ageGroup;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào tên: ");
        name = scanner.nextLine();
        System.out.println("Nhập vào năm sinh: ");
        year = scanner.nextInt();
         
        age = 2017 - year;  
        if (age < 16) {
            ageGroup = "tuổi vị thành niên";
        } else if (age >= 16 || age < 18) {
            ageGroup = "tuổi trưởng thành";
        } else {
            ageGroup = "đã già";
        }
         
        System.out.println("Bạn " + name + " thuộc nhóm " + ageGroup);
    }
 
}