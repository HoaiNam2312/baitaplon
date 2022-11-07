package Bai_Tap_Lon.utils;

import Bai_Tap_Lon.account.AccountLessor;
import Bai_Tap_Lon.account.AccountRenter;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class ReadAndWrite {
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public static void writeFileAccountLessor(Map<AccountLessor,String> accountLessorList, String fileAddress) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileAddress))) {
            for (Map.Entry accountLessor : accountLessorList.entrySet()) {
                bufferedWriter.write(accountLessor.getKey().toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeFileAccountRenter(Map<AccountRenter,String> accountLessorList, String fileAddress) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileAddress))) {
            for (Map.Entry accountRenter : accountLessorList.entrySet()) {
                bufferedWriter.write(accountRenter.getKey().toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Map<AccountLessor,String> readFileAccountLessor(String fileAddress) {
        Map<AccountLessor,String> accountLessorMap = new TreeMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileAddress))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String lineArr[] = line.split(",");
                int gioiTinh = (lineArr[3].equals("Nam"))?1:0;
                Boolean trangThaiGiaoDich = (lineArr[4].equals("Đã giao dịch"))?true:false;
                AccountLessor accountLessor = new AccountLessor(lineArr[0],lineArr[1],dateFormat.parse(lineArr[2]),gioiTinh,trangThaiGiaoDich,Float.parseFloat(lineArr[5]),lineArr[6],Integer.parseInt(lineArr[7]),Integer.parseInt(lineArr[8]));
                accountLessorMap.put(accountLessor,lineArr[0]);
            }
            return accountLessorMap;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    public static Map<AccountRenter,String> readFileAccountRenter(String fileAddress) {
        Map<AccountRenter,String> accountRenterMap = new TreeMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileAddress))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String lineArr[] = line.split(",");
                int gioiTinh = (lineArr[3].equals("Nam"))?1:0;
                Boolean trangThaiGiaoDich = (lineArr[4].equals("Đã giao dịch"))?true:false;
                AccountRenter accountRenter = new AccountRenter(lineArr[0],lineArr[1],dateFormat.parse(lineArr[2]),gioiTinh,trangThaiGiaoDich,Float.parseFloat(lineArr[5]),Float.parseFloat(lineArr[6]),Integer.parseInt(lineArr[7]),Integer.parseInt(lineArr[8]));
                accountRenterMap.put(accountRenter,lineArr[0]);
            }
            return accountRenterMap;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
