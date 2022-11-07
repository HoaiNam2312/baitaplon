package Bai_Tap_Lon.utils;

import Bai_Tap_Lon.account.AccountLessor;
import Bai_Tap_Lon.account.AccountRenter;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
    static Scanner sc = new Scanner(System.in);

    public static String regexCCCD1(String input, Map<AccountLessor,String> lessorMap) {
        Boolean check = true;
        do {
            try {
                if (Pattern.matches("^\\d{12}$",input)) {
                    if (!lessorMap.containsValue(input)) {
                        check = false;
                    }else {
                        throw new AccountDuplicateException("Số CCCD: "+input+" đã bị trùng lặp trước đó!!!\nVui lòng nhập lại số CCCD:");
                    }
                }else {
                    throw new IDInvalidException("Định dạng nhập vào không đúng!!!\nĐịnh dạng đúng cho số căn cước công dân: 1 chuỗi bao gồm 12 số\nVui lòng nhập lại:");
                }
            } catch (IDInvalidException e) {
                System.out.println(e.getMessage());
                input = sc.nextLine();
            } catch (AccountDuplicateException e) {
                System.out.println(e.getMessage());
                input = sc.nextLine();
            }
        } while (check);
        return input;
    }
    public static String regexCCCD2(String input, Map<AccountRenter,String> lessorMap) {
        Boolean check = true;
        do {
            try {
                if (Pattern.matches("^\\d{12}$",input)) {
                    if (!lessorMap.containsValue(input)) {
                        check = false;
                    }else {
                        throw new AccountDuplicateException ("Số CCCD: "+input+" đã bị trùng lập trước đó!!!\nVui lòng nhập lại số CCCD:");
                    }
                }else {
                    throw new IDInvalidException("Định dạng nhập vào không đúng!!!\nĐịnh dạng đúng cho số căn cước công dân: 1 chuỗi bao gồm 12 số\nVui lòng nhập lại:");
                }
            } catch (IDInvalidException e) {
                System.out.println(e.getMessage());
                input = sc.nextLine();
            } catch (AccountDuplicateException e) {
                System.out.println(e.getMessage());
                input = sc.nextLine();
            }
        } while (check);
        return input;
    }

    public static String regexAge(String input) {
        Boolean check = true;
        do {
            try {
                if (Pattern.matches("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$",input)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(input, formatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age,now).getYears();
                    if (current >= 18) {
                        check = false;
                    }else {
                        throw new AccountInvalidException("Người cho thuê/ người thuê nhàphải đủ 18 tuổi!!!\nVui lòng nhập lại:");
                    }
                }else {
                    throw new AccountInvalidException ("Định dạng nhập vào không đúng!!!\\nĐịnh dạng đúng cho ngày sinh phải là: dd/MM/yyyy\nVui lòng nhập lại:");
                }
            } catch (AccountInvalidException e) {
                System.out.println(e.getMessage());
                input = sc.nextLine();
            }
        } while (check);
        return input;
    }
}
