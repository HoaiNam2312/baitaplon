package Bai_Tap_Lon.account;

import java.util.Date;

public abstract class Account implements Comparable<Account>{
    private String CCCD;
    private String hoVaTen;
    private Date ngaySinh;
    private int gioiTinh;
    private boolean trangThaiGiaoDich;

    public Account() {
    }

    public Account(String CCCD, String hoVaTen, Date ngaySinh, int gioiTinh, boolean trangThaiGiaoDich) {
        this.CCCD = CCCD;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.trangThaiGiaoDich = trangThaiGiaoDich;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        if (gioiTinh == 0) {
            return "Nữ";
        }
        return "Nam";
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String isTrangThaiGiaoDich() {
        if (trangThaiGiaoDich) {
            return "Đã giao dịch";
        }
        return "Chưa giao dịch";
    }

    public void setTrangThaiGiaoDich(boolean trangThaiGiaoDich) {
        this.trangThaiGiaoDich = trangThaiGiaoDich;
    }

    public String getInfo() {
        return "Account{" +
                "CCCD='" + CCCD + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh=" + gioiTinh +
                ", trangThaiGiaoDich=" + trangThaiGiaoDich +
                '}';
    }

    @Override
    public int compareTo(Account o) {
        if (this.getHoVaTen().equals(o.getHoVaTen())) {
            return -o.getNgaySinh().compareTo(this.ngaySinh);
        }
        return hoVaTen.compareTo(o.getHoVaTen());
    }

}
