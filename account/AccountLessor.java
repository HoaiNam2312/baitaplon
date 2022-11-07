package Bai_Tap_Lon.account;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountLessor extends Account{
    private float dienTichNha;
    private String diaChi;
    private int soNguoi;
    private int giaTien;
    private static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public AccountLessor() {
    }

    public AccountLessor(float dienTichNha, String diaChi, int soNguoi, int giaTien) {
        this.dienTichNha = dienTichNha;
        this.diaChi = diaChi;
        this.soNguoi = soNguoi;
        this.giaTien = giaTien;
    }

    public AccountLessor(String CCCD, String hoVaTen, Date ngaySinh, int gioiTinh, boolean trangThaiGiaoDich, float dienTichNha, String diaChi, int soNguoi, int giaTien) {
        super(CCCD, hoVaTen, ngaySinh, gioiTinh, trangThaiGiaoDich);
        this.dienTichNha = dienTichNha;
        this.diaChi = diaChi;
        this.soNguoi = soNguoi;
        this.giaTien = giaTien;
    }

    public float getDienTichNha() {
        return dienTichNha;
    }

    public void setDienTichNha(float dienTichNha) {
        this.dienTichNha = dienTichNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }


    public String getInfo() {
        return super.getInfo() +
                ", dienTichNha=" + dienTichNha +
                ", diaChi='" + diaChi + '\'' +
                ", soNguoi=" + soNguoi +
                ", giaTien=" + giaTien +
                '}';
    }

    @Override
    public String toString() {
        return getCCCD()+","+getHoVaTen()+","+df.format(getNgaySinh())+","+getGioiTinh()+","+isTrangThaiGiaoDich()+","+dienTichNha+","+diaChi+","+soNguoi+","+giaTien;
    }
}
