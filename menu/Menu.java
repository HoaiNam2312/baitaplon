package Bai_Tap_Lon.menu;

import Bai_Tap_Lon.inputAcc.inputAccount;

import java.text.ParseException;
import java.util.Scanner;

public class Menu {
    public static inputAccount inputAccount = new inputAccount();
    public static Scanner sc = new Scanner(System.in);

    public static void displayMainMenu() throws ParseException {
        int option = 0;
//        boolean check = true;
//        while (check) {
//            System.out.println("--------MENU MAIN--------\n");
//            System.out.println("1. Chức năng đăng ký người thuê/cho thuê nhà\n" +
//                    "2. Hiển thị thông tin người thuê/cho thuê nhà\n" +
//                    "3. Tìm kiếm người cho thuê phù hợp theo CCCD của người thuê\n" +
//                    "4. Hiển thị và xoá những người thuê/cho thuê nhà thành công\n" +
//                    "5. Lưu lại dữ liệu người thuê/cho thuê vào file\n" +
//                    "6. Import dữ liệu người thuê/cho thuê vào chương trình\n" +
//                    "7. Thoát\n");
//            System.out.println("Nhập lựa chon của bạn: ");
//            try {
//                option = Integer.parseInt(sc.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Bạn đã nhập sai định dạng!!!");
//            }
//            if (option == 1) {
//                displayInputAccountMenu();
//            } else if (option == 2) {
//                inputAccount.displayList();
//            } else if (option == 3) {
//                inputAccount.tiemKiemNha();
//            } else if (option == 4) {
//                inputAccount.displayAndRemove();
//            } else if (option == 5) {
//                inputAccount.writeFile();
//            } else if (option == 6) {
//                inputAccount.readFile();
//            } else if (option == 7) {
//                check = false;
//            } else {
//                System.out.println("Vui lòng chỉ nhập số từ 1 đến 6,\nVui lòng nhập lại:\n");
//            }
//        }
        boolean check = true;

        while (check) {
            System.out.println("------HOUSE MANAGEMENT SYSTEM------");
            System.out.println("1. Register ");
            System.out.println("2. Show information");
            System.out.println("3. Search ");
            System.out.println("4. delete and display: ");
            System.out.println("5. save account information in file.");
            System.out.println("6. Import information from file to program ");
            System.out.println("7. exit ");
            System.out.println("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("you entered the wrong format, please type again from 1 to 7 :");
            }
            switch (choice) {
                case 1:
                    displayInputAccountMenu();
                    break;
                case 2:
                    inputAccount.displayList();
                    break;
                case 3:
                    inputAccount.tiemKiemNha();
                    break;
                case 4:
                    inputAccount.displayAndRemove();
                    break;
                case 5:
                    inputAccount.writeFile();
                    System.out.println("ghi thành công!");
                    break;
                case 6:
                    inputAccount.readFile();
                    System.out.println("Đọc thành công!");
                    break;
                case 7:
                    System.out.println("Cảm ơn bạn đã sử dụng hệ thống!");
                    check = false;
                    break;
            }
        }
    }
    public static void displayInputAccountMenu() throws ParseException {
        int option = 0;
        do {
            System.out.println("------Đăng ký tài khoản------\n");
            System.out.println("1.\tNgười cho thuê nhà\n" +
                    "2.\tNgười thuê nhà\n" +
                    "3.\tQuay lại Menu chính\n");
            System.out.println("Nhập lựa chon của bạn: ");
            try {
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng!!!");
            }
            switch (option) {
                case 1:
                    inputAccount.addAccountLessor();
                    break;
                case 2:
                    inputAccount.addAccountRenter();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Chỉ nhập số từ 1 đến 3!!!\nVui nhập chọn lại:");
                    break;
            }
        } while (option != 3);
    }
}
