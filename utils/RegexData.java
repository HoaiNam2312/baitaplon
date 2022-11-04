package Bai_Tap_Lon.utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
    static Scanner sc = new Scanner(System.in);

    public static String regexCCCD(String input) {
        Boolean check = true;
        do {
            try {
                if (Pattern.matches("^\\d{12}$",input)) {
                    check = false;
//                    if () {
//                    }else {
//
//                    }
                }else {
                    throw new IDInvalidException("Định dạng nhập vào không đúng!!!\nĐịnh dạng đúng cho số căn cước công dân: 1 chuỗi bao gồm 12 số\nVui lòng nhập lại:");
                }
            } catch (IDInvalidException e) {
                System.out.println(e.getMessage());
                input = sc.nextLine();
            }
        } while (check);
        return input;
    }
}
