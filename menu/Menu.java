package Bai_Tap_Lon.menu;

import Bai_Tap_Lon.inputAcc.inputAccount;

import java.text.ParseException;
import java.util.Scanner;

public class Menu {
    public static inputAccount inputAccount = new inputAccount();
    public static Scanner sc = new Scanner(System.in);
    public static void displayMainMenu() throws ParseException {
        int option = 0;
        do {
            System.out.println("--------MENU MAIN--------");
            System.out.println("1. Chức năng đăng ký người thuê/cho thuê nhà\n" +
                    "2. Hiển thị thông tin người thuê/cho thuê nhà\n" +
                    "3. Tìm kiếm người cho thuê phù hợp theo CCCD của người thuê\n" +
                    "4. Hiển thị và xoá những người thuê/cho thuê nhà thành công\n" +
                    "5. Lưu lại dữ liệu người thuê/cho thuê vào file\n" +
                    "6. Import dữ liệu người thuê/cho thuê vào chương trình\n" +
                    "7. Thoát\n");
            System.out.println("Nhập lựa chon của bạn: ");
            try {
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại!");
            }
            if (option == 1) {
                displayInputAccountMenu();
            } else if (option == 2) {

            } else if (option == 3) {

            } else if (option == 4) {

            } else if (option == 5) {

            } else if (option == 6) {
                break;
            } else {
                System.out.println("Vui lòng chỉ nhập số từ 1 đến 6");
            }
        } while (option != 6);
    }

    public static void displayInputAccountMenu() throws ParseException {
        int option=0;
        do {
            System.out.println("------Đăng ký tài khoản------\n");
            System.out.println("1.\tNgười cho thuê nhà\n" +
                    "2.\tNgười thuê nhà\n"+
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
        } while (option!=3);
    }
}
