package Bai_Tap_Lon.inputAcc;

import Bai_Tap_Lon.account.AccountLessor;
import Bai_Tap_Lon.account.AccountRenter;
import Bai_Tap_Lon.utils.ReadAndWrite;
import Bai_Tap_Lon.utils.RegexData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class inputAccount {
    private Map<AccountLessor, String> accountLessorList = new TreeMap<>();
    private Map<AccountRenter, String> accountRenterList = new TreeMap<>();
    private Scanner sc = new Scanner(System.in);
    private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public void addAccountLessor() throws ParseException {
        int luaChon = 2;
        accountLessorList = ReadAndWrite.readFileAccountLessor("E:\\CODEGYM\\Module 2\\src\\Bai_Tap_Lon\\Data\\nguoiChoThue.csv");
        System.out.println("Nhập số căn cước công dân:");
        String CCCD = RegexData.regexCCCD1(sc.nextLine(), accountLessorList);
        System.out.println("Nhập họ và tên:");
        String hoVaTen = sc.nextLine();
        System.out.println("Nhập ngày sinh:");
        Date ngaySinh = df.parse(RegexData.regexAge(sc.nextLine()));
        System.out.println("Chọn giới tính:\n" +
                "0. Nữ\n" +
                "1. Nam");
        try {
            luaChon = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Program have an unexpected error occurred !!!");
        }
        while (luaChon != 0 && luaChon != 1) {
            System.out.println("Vui lòng chỉ chọn 1 hoặc 0:\n" +
                    "0. Nữ\n" +
                    "1. Nam");
            try {
                luaChon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Program have an unexpected error occurred !!!");
            }
        }
        int gioiTinh = luaChon;
        luaChon = 2;
        System.out.println("Chọn trạng thái đã giao dịch:\n" +
                "0. Chưa giao dịch\n" +
                "1. Đã giao dịch");
        try {
            luaChon = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Program have an unexpected error occurred !!!");
        }
        while (luaChon != 0 && luaChon != 1) {
            System.out.println("Vui lòng chỉ chọn 1 hoặc 0:\n" +
                    "0. Chưa giao dịch\n" +
                    "1. Đã giao dịch");
            try {
                luaChon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Program have an unexpected error occurred !!!");
            }
        }
        boolean trangThaiGiaoDich = false;
        if (luaChon == 1) {
            trangThaiGiaoDich = true;
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
        accountLessorList.put(nguoiChoThue, CCCD);
        ReadAndWrite.writeFileAccountLessor(accountLessorList, "E:\\CODEGYM\\Module 2\\src\\Bai_Tap_Lon\\Data\\nguoiChoThue.csv");
    }

    public void addAccountRenter() throws ParseException {
        int luaChon = 2;
        accountRenterList = ReadAndWrite.readFileAccountRenter("E:\\CODEGYM\\Module 2\\src\\Bai_Tap_Lon\\Data\\nguoiThue.csv");
        System.out.println("Nhập căn cước công dân:");
        String CCCD = RegexData.regexCCCD2(sc.nextLine(), accountRenterList);
        System.out.println("Nhập họ và tên:");
        String hoVaTen = sc.nextLine();
        System.out.println("Nhập ngày sinh:");
        Date ngaySinh = df.parse(RegexData.regexAge(sc.nextLine()));
        System.out.println("Chọn giới tính:\n" +
                "0. Nữ\n" +
                "1. Nam");

        try {
            luaChon = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Program have an unexpected error occurred !!!");
        }
        while (luaChon != 0 && luaChon != 1) {
            System.out.println("Vui lòng chỉ chọn 1 hoặc 0:\n" +
                    "0. Nữ\n" +
                    "1. Nam");
            try {
                luaChon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Program have an unexpected error occurred !!!");
            }
        }
        int gioiTinh = luaChon;

        System.out.println("Chọn trạng thái đã giao dịch:\n" +
                "0. Chưa giao dịch\n" +
                "1. Đã giao dịch");
        luaChon = Integer.parseInt(sc.nextLine());
        while (luaChon != 0 && luaChon != 1) {
            System.out.println("Vui lòng chỉ chọn 1 hoặc 0:\n" +
                    "0. Chưa giao dịch\n" +
                    "1. Đã giao dịch");
            luaChon = Integer.parseInt(sc.nextLine());
        }
        boolean trangThaiGiaoDich = false;
        if (luaChon == 1) {
            trangThaiGiaoDich = true;
        }

        System.out.println("Nhập diện tích nhà nhỏ nhất cần thuê:");
        float minDienTich = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập diện tích nhà lớn nhất cần thuê:");
        float maxDienTich = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập giá tiền nhỏ nhất cần thuê:");
        int minGiaTien = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giá tiền lớn nhất cần thuê:");
//        int maxGiaTien = Integer.parseInt(sc.nextLine());
        int maxGiaTien = accountRenterList.size()+1;
        AccountRenter nguoiThueNha = new AccountRenter(CCCD, hoVaTen, ngaySinh, gioiTinh, trangThaiGiaoDich, minDienTich, maxDienTich, minGiaTien, maxGiaTien);
        accountRenterList.put(nguoiThueNha, CCCD);
        ReadAndWrite.writeFileAccountRenter(accountRenterList, "E:\\CODEGYM\\Module 2\\src\\Bai_Tap_Lon\\Data\\nguoiThue.csv");
    }


    public void displayList() {
        System.out.println("Danh sách người cho thuê:\n");
        for (int i = 0; i < 156; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%-15s|%-15s|%-20s|%-16s|%-22s|%-15s|%-12s|%-16s|%-15s|\n", "CCCD", "Họ và tên", "Ngày sinh", "Giới tính", "Trạng thái giao dịch", "Diện tích nhà", "Địa chỉ", "Số người tối đa", "Giá tiền");
        for (int i = 0; i < 156; i++) {
            System.out.print("-");
        }
        System.out.println();
        accountLessorList = ReadAndWrite.readFileAccountLessor("E:\\CODEGYM\\Module 2\\src\\Bai_Tap_Lon\\Data\\nguoiChoThue.csv");
        for (Map.Entry<AccountLessor, String> account : accountLessorList.entrySet()) {
            System.out.printf("|%-15s|%-15s|%-20s|%-16s|%-22s|%-15f|%-12s|%-16d|%-15d|\n", account.getKey().getCCCD(), account.getKey().getHoVaTen(), df.format(account.getKey().getNgaySinh()), account.getKey().getGioiTinh(), account.getKey().isTrangThaiGiaoDich(), account.getKey().getDienTichNha(), account.getKey().getDiaChi(), account.getKey().getSoNguoi(), account.getKey().getGiaTien());
        }
        System.out.println();

        System.out.println("Danh sách người thuê nhà:\n");
        for (int i = 0; i < 178; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%-15s|%-15s|%-20s|%-16s|%-22s|%-20s|%-20s|%-20s|%-20s|\n", "CCCD", "Họ và tên", "Ngày sinh", "Giới tính", "Trạng thái giao dịch", "Diện tích nhỏ nhất", "Diện tích lớn nhất", "Giá tiền nhỏ nhất", "Giá tiền lớn nhất");
        for (int i = 0; i < 178; i++) {
            System.out.print("-");
        }
        System.out.println();
        accountRenterList = ReadAndWrite.readFileAccountRenter("E:\\CODEGYM\\Module 2\\src\\Bai_Tap_Lon\\Data\\nguoiThue.csv");
        for (Map.Entry<AccountRenter, String> account : accountRenterList.entrySet()) {
            System.out.printf("|%-15s|%-15s|%-20s|%-16s|%-22s|%-20f|%-20f|%-20d|%-20d|\n", account.getKey().getCCCD(), account.getKey().getHoVaTen(), df.format(account.getKey().getNgaySinh()), account.getKey().getGioiTinh(), account.getKey().isTrangThaiGiaoDich(), account.getKey().getMinDienTich(), account.getKey().getMaxDienTich(), account.getKey().getMinGiaTien(), account.getKey().getMaxGiaTien());
        }
        System.out.println();
    }

    public void tiemKiemNha() {
        sc.nextLine();
        System.out.println("---Tìm kiếm nhà---\n");
        System.out.println("Nhập số CCCD của người thuê nhà cần tìm kiếm:");
        String CCCD = RegexData.regexCCCD1(sc.nextLine(), accountLessorList);
        accountRenterList = ReadAndWrite.readFileAccountRenter("E:\\CODEGYM\\Module 2\\src\\Bai_Tap_Lon\\Data\\nguoiThue.csv");
        while (!accountRenterList.containsValue(CCCD)) {
            System.out.println("Nguoi thue nha nay chua ton tai trong co so du lieu.\nVui lòng nhập lại CCCD:");
            CCCD = RegexData.regexCCCD1(sc.nextLine(), accountLessorList);
        }
        Map<String, AccountRenter> temp = new TreeMap<>();
        for (Map.Entry<AccountRenter, String> renter : accountRenterList.entrySet()) {
            temp.put(renter.getValue(), renter.getKey());
        }
        Float minDienTich = temp.get(CCCD).getMinDienTich();
        Float maxDienTich = temp.get(CCCD).getMaxDienTich();
        int minGiaTien = temp.get(CCCD).getMinGiaTien();
        int maxGiaTien = temp.get(CCCD).getMaxGiaTien();
        accountLessorList = ReadAndWrite.readFileAccountLessor("E:\\CODEGYM\\Module 2\\src\\Bai_Tap_Lon\\Data\\nguoiChoThue.csv");
        Map<AccountLessor, String> danhSachCanTim = new TreeMap<>();
        for (Map.Entry<AccountLessor, String> lessorList : accountLessorList.entrySet()) {
            Boolean dieukien1 = lessorList.getKey().getDienTichNha() > minDienTich && lessorList.getKey().getDienTichNha() <= maxDienTich;
            Boolean dieukien2 = lessorList.getKey().getGiaTien() >= minGiaTien && lessorList.getKey().getDienTichNha() <= maxGiaTien;
            if (dieukien1 && dieukien2) {
                danhSachCanTim.put(lessorList.getKey(), lessorList.getValue());
            }
        }

        System.out.println("Danh sách người cho thuê cần tìm:\n");
        for (int i = 0; i < 156; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%-15s|%-15s|%-20s|%-16s|%-22s|%-15s|%-12s|%-16s|%-15s|\n", "CCCD", "Họ và tên", "Ngày sinh", "Giới tính", "Trạng thái giao dịch", "Diện tích nhà", "Địa chỉ", "Số người tối đa", "Giá tiền");
        for (int i = 0; i < 156; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (Map.Entry<AccountLessor, String> account : danhSachCanTim.entrySet()) {
            System.out.printf("|%-15s|%-15s|%-20s|%-16s|%-22s|%-15f|%-12s|%-16d|%-15d|\n", account.getKey().getCCCD(), account.getKey().getHoVaTen(), df.format(account.getKey().getNgaySinh()), account.getKey().getGioiTinh(), account.getKey().isTrangThaiGiaoDich(), account.getKey().getDienTichNha(), account.getKey().getDiaChi(), account.getKey().getSoNguoi(), account.getKey().getGiaTien());
        }
        System.out.println();
    }

    public void writeFile() {
        ReadAndWrite.writeFileAccountRenter(accountRenterList, "E:\\CODEGYM\\Module 2\\src\\Bai_Tap_Lon\\Data\\nguoiThue.csv");
        ReadAndWrite.writeFileAccountLessor(accountLessorList, "E:\\CODEGYM\\Module 2\\src\\Bai_Tap_Lon\\Data\\nguoiChoThue.csv");
    }

    public void readFile() {
        accountLessorList = ReadAndWrite.readFileAccountLessor("E:\\CODEGYM\\Module 2\\src\\Bai_Tap_Lon\\Data\\nguoiChoThue.csv");

        accountRenterList = ReadAndWrite.readFileAccountRenter("E:\\CODEGYM\\Module 2\\src\\Bai_Tap_Lon\\Data\\nguoiThue.csv");
    }

    public void displayAndRemove() {
        accountLessorList = ReadAndWrite.readFileAccountLessor("E:\\CODEGYM\\Module 2\\src\\Bai_Tap_Lon\\Data\\nguoiChoThue.csv");
        accountRenterList = ReadAndWrite.readFileAccountRenter("E:\\CODEGYM\\Module 2\\src\\Bai_Tap_Lon\\Data\\nguoiThue.csv");

        Map<AccountLessor, String> accountLessorTransacted = new TreeMap<>();
        Map<AccountRenter, String> accountRenterTransacted = new TreeMap<>();
        for (Map.Entry<AccountLessor, String> accountLessor : accountLessorList.entrySet()) {
            if (accountLessor.getKey().isTrangThaiGiaoDich().equals("Đã giao dịch")) {
                accountLessorTransacted.put(accountLessor.getKey(), accountLessor.getValue());
//                accountLessorList.remove(accountLessor.getKey());
            }
        }

        for (Map.Entry<AccountLessor, String> lessorTransacted : accountLessorTransacted.entrySet()) {
            accountLessorList.remove(lessorTransacted.getKey());
        }

        for (Map.Entry<AccountRenter, String> accountRenter : accountRenterList.entrySet()) {
            if (accountRenter.getKey().isTrangThaiGiaoDich().equals("Đã giao dịch")) {
                accountRenterTransacted.put(accountRenter.getKey(), accountRenter.getValue());
//                accountRenterList.remove(accountRenter.getKey());
            }
        }

        for (Map.Entry<AccountRenter, String> renterTransacted : accountRenterTransacted.entrySet()) {
            accountRenterList.remove(renterTransacted.getKey());
        }

        ReadAndWrite.writeFileAccountLessor(accountLessorList,"E:\\CODEGYM\\Module 2\\src\\Bai_Tap_Lon\\Data\\nguoiChoThue.csv");
        ReadAndWrite.writeFileAccountRenter(accountRenterList,"E:\\CODEGYM\\Module 2\\src\\Bai_Tap_Lon\\Data\\nguoiThue.csv");

        System.out.println("Danh sách người cho thuê thành công:\n");
        for (int i = 0; i < 156; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%-15s|%-15s|%-20s|%-16s|%-22s|%-15s|%-12s|%-16s|%-15s|\n", "CCCD", "Họ và tên", "Ngày sinh", "Giới tính", "Trạng thái giao dịch", "Diện tích nhà", "Địa chỉ", "Số người tối đa", "Giá tiền");
        for (int i = 0; i < 156; i++) {
            System.out.print("-");
        }
        System.out.println();
//        accountLessorList = ReadAndWrite.readFileAccountLessor("E:\\CODEGYM\\Module 2\\src\\Bai_Tap_Lon\\Data\\nguoiChoThue.csv");
        for (Map.Entry<AccountLessor, String> account : accountLessorTransacted.entrySet()) {
            System.out.printf("|%-15s|%-15s|%-20s|%-16s|%-22s|%-15f|%-12s|%-16d|%-15d|\n", account.getKey().getCCCD(), account.getKey().getHoVaTen(), df.format(account.getKey().getNgaySinh()), account.getKey().getGioiTinh(), account.getKey().isTrangThaiGiaoDich(), account.getKey().getDienTichNha(), account.getKey().getDiaChi(), account.getKey().getSoNguoi(), account.getKey().getGiaTien());
        }
        System.out.println();

        System.out.println("Danh sách người thuê nhà thành công:\n");
        for (int i = 0; i < 178; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|%-15s|%-15s|%-20s|%-16s|%-22s|%-20s|%-20s|%-20s|%-20s|\n", "CCCD", "Họ và tên", "Ngày sinh", "Giới tính", "Trạng thái giao dịch", "Diện tích nhỏ nhất", "Diện tích lớn nhất", "Giá tiền nhỏ nhất", "Giá tiền lớn nhất");
        for (int i = 0; i < 178; i++) {
            System.out.print("-");
        }
        System.out.println();
//        accountRenterList = ReadAndWrite.readFileAccountRenter("E:\\CODEGYM\\Module 2\\src\\Bai_Tap_Lon\\Data\\nguoiThue.csv");
        for (Map.Entry<AccountRenter, String> account : accountRenterTransacted.entrySet()) {
            System.out.printf("|%-15s|%-15s|%-20s|%-16s|%-22s|%-20f|%-20f|%-20d|%-20d|\n", account.getKey().getCCCD(), account.getKey().getHoVaTen(), df.format(account.getKey().getNgaySinh()), account.getKey().getGioiTinh(), account.getKey().isTrangThaiGiaoDich(), account.getKey().getMinDienTich(), account.getKey().getMaxDienTich(), account.getKey().getMinGiaTien(), account.getKey().getMaxGiaTien());
        }
        System.out.println();
    }
}
