package Bai_Tap_Lon.account;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountRenter extends Account {
    private float minDienTich;
    private float maxDienTich;
    private int minGiaTien;
    private int maxGiaTien;

    private static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    public AccountRenter() {
    }

    public AccountRenter(float minDienTich, float maxDienTich, int minGiaTien, int maxGiaTien) {
        this.minDienTich = minDienTich;
        this.maxDienTich = maxDienTich;
        this.minGiaTien = minGiaTien;
        this.maxGiaTien = maxGiaTien;
    }

    public AccountRenter(String CCCD, String hoVaTen, Date ngaySinh, int gioiTinh, boolean trangThaiGiaoDich, float minDienTich, float maxDienTich, int minGiaTien, int maxGiaTien) {
        super(CCCD, hoVaTen, ngaySinh, gioiTinh, trangThaiGiaoDich);
        this.minDienTich = minDienTich;
        this.maxDienTich = maxDienTich;
        this.minGiaTien = minGiaTien;
        this.maxGiaTien = maxGiaTien;
    }

    public float getMinDienTich() {
        return minDienTich;
    }

    public void setMinDienTich(float minDienTich) {
        this.minDienTich = minDienTich;
    }

    public float getMaxDienTich() {
        return maxDienTich;
    }

    public void setMaxDienTich(float maxDienTich) {
        this.maxDienTich = maxDienTich;
    }

    public int getMinGiaTien() {
        return minGiaTien;
    }

    public void setMinGiaTien(int minGiaTien) {
        this.minGiaTien = minGiaTien;
    }

    public int getMaxGiaTien() {
        return maxGiaTien;
    }

    public void setMaxGiaTien(int maxGiaTien) {
        this.maxGiaTien = maxGiaTien;
    }


    public String getInfo() {
        return super.getInfo()+
                ", minDienTich=" + minDienTich +
                ", maxDienTich=" + maxDienTich +
                ", minGiaTien=" + minGiaTien +
                ", maxGiaTien=" + maxGiaTien +
                '}';
    }

    @Override
    public String toString() {
        return getCCCD()+","+getHoVaTen()+","+df.format(getNgaySinh())+","+getGioiTinh()+","+isTrangThaiGiaoDich()+","+minDienTich+","+maxDienTich+","+minGiaTien+","+maxGiaTien;
    }
}
