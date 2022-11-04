package Bai_Tap_Lon.inputAcc;

import Bai_Tap_Lon.account.Account;
import Bai_Tap_Lon.account.AccountLessor;
import Bai_Tap_Lon.account.AccountRenter;
import Bai_Tap_Lon.utils.ReadAndWrite;
import Bai_Tap_Lon.utils.RegexData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class inputAccount {
    private ArrayList<AccountLessor> accountLessorList = new ArrayList<>();
    private ArrayList<AccountRenter> accountRenterList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    public void addAccountLessor() throws ParseException {
        int luaChon = 0;
        System.out.println("Nhập căn cước công dân:");
        String CCCD = RegexData.regexCCCD(sc.nextLine());
        System.out.println("Nhập họ và tên:");
        String hoVaTen = sc.nextLine();
        System.out.println("Nhập ngày sinh:");
        Date ngaySinh = df.parse(sc.nextLine());
        System.out.println("Chọn giới tính:\n" +
                "0. Nữ\n" +
                "1. Nam");
        luaChon = Integer.parseInt(sc.nextLine());
        while (luaChon != 0 && luaChon != 1) {
            System.out.println("Vui lòng chỉ chọn 1 hoặc 0:\n"+
                    "0. Nữ\n" +
                    "1. Nam");
            luaChon = Integer.parseInt(sc.nextLine());
        }
        int gioiTinh = luaChon;

        System.out.println("Chọn trạng thái đã giao dịch:\n" +
                "0. Chưa giao dịch\n" +
                "1. Đã giao dịch");
        luaChon = Integer.parseInt(sc.nextLine());
        while (luaChon != 0 && luaChon != 1) {
            System.out.println("Vui lòng chỉ chọn 1 hoặc 0:\n"+
                    "0. Chưa giao dịch\n" +
                    "1. Đã giao dịch");
            luaChon = Integer.parseInt(sc.nextLine());
        }
        boolean trangThaiGiaoDich=false;
        if (luaChon == 1) {
            trangThaiGiaoDich=true;
        }

        System.out.println("Nhập diện tích nhà cho thuê:");
        float dienTichNha = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập số người ở tối đa:");
        int soNguoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ nhà:");
        String diaChi = sc.nextLine();
        System.out.println("Nhập giá tiền cho thuê nhà:");
        int giaTien = Integer.parseInt(sc.nextLine());
        AccountLessor nguoiChoThue = new AccountLessor(CCCD, hoVaTen, ngaySinh, gioiTinh, trangThaiGiaoDich, dienTichNha, diaChi, soNguoi, giaTien);
        accountLessorList.add(nguoiChoThue);
        ReadAndWrite.writeFileAccountLessor(accountLessorList,"E:\\CODEGYM\\Module 2\\src\\Bai_Tap_Lon\\Data\\nguoiChoThue.csv");
    }

    public void addAccountRenter() throws ParseException {
        int luaChon = 0;
        System.out.println("Nhập căn cước công dân:");
        String CCCD = RegexData.regexCCCD(sc.nextLine());
        System.out.println("Nhập họ và tên:");
        String hoVaTen = sc.nextLine();
        System.out.println("Nhập ngày sinh:");
        Date ngaySinh = df.parse(sc.nextLine());
        System.out.println("Chọn giới tính:\n" +
                "0. Nữ\n" +
                "1. Nam");
        luaChon = Integer.parseInt(sc.nextLine());
        while (luaChon != 0 && luaChon != 1) {
            System.out.println("Vui lòng chỉ chọn 1 hoặc 0:\n"+
                    "0. Nữ\n" +
                    "1. Nam");
            luaChon = Integer.parseInt(sc.nextLine());
        }
        int gioiTinh = luaChon;

        System.out.println("Chọn trạng thái đã giao dịch:\n" +
                "0. Chưa giao dịch\n" +
                "1. Đã giao dịch");
        luaChon = Integer.parseInt(sc.nextLine());
        while (luaChon != 0 && luaChon != 1) {
            System.out.println("Vui lòng chỉ chọn 1 hoặc 0:\n"+
                    "0. Chưa giao dịch\n" +
                    "1. Đã giao dịch");
            luaChon = Integer.parseInt(sc.nextLine());
        }
        boolean trangThaiGiaoDich=false;
        if (luaChon == 1) {
            trangThaiGiaoDich=true;
        }

        System.out.println("Nhập diện tích nhà nhỏ nhất cần thuê:");
        float minDienTich = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập diện tích nhà lớn nhất cần thuê:");
        float maxDienTich = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập giá tiền nhỏ nhất cần thuê:");
        int minGiaTien = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giá tiền lớn nhất cần thuê:");
        int maxGiaTien = Integer.parseInt(sc.nextLine());
        AccountRenter nguoiThueNha = new AccountRenter(CCCD, hoVaTen, ngaySinh, gioiTinh, trangThaiGiaoDich, minDienTich, maxDienTich, minGiaTien, maxGiaTien);
        accountRenterList.add(nguoiThueNha);
    }
}
