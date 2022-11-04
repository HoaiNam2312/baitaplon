package Bai_Tap_Lon.utils;

import Bai_Tap_Lon.account.AccountLessor;
import Bai_Tap_Lon.account.AccountRenter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReadAndWrite {
    public static void writeFileAccountLessor(ArrayList<AccountLessor> accountLessorList, String fileAddress) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileAddress))) {
            for (AccountLessor accountLessor : accountLessorList) {
                bufferedWriter.write(accountLessor.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeFileAccountRenter(ArrayList<AccountRenter> accountLessorList, String fileAddress) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileAddress))) {
            for (AccountRenter accountRenter : accountLessorList) {
                bufferedWriter.write(accountRenter.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
