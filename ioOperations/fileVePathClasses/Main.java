package ioOperations.fileVePathClasses;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        File file = 
        new File("C:\\Users\\Ali_Bozlak\\Desktop\\turkcellJava301\\ioOperations\\sample.txt");

        System.out.println("Bu dizinde sample_folder klasörü var mı : " + file.exists());
        System.out.println("Dosya okunabilir mi : " + file.canRead());
        System.out.println("Dosya yazılabilir mi : " + file.canWrite());
        System.out.println("Bu bir klasör mü : " + file.isDirectory());
        System.out.println("Dosyanın tam konumu : " + file.getAbsolutePath());
        System.out.println("Dosyanın içinde bulunduğu konum : " + file.getParent());
        System.out.println("Dosya kaç byte : " + file.length());
        System.out.println("Dosyadaki son düzenleme : " + new Date(file.lastModified()));
        System.out.println("--------------");

        File file2 = new File("C:\\Users\\Ali_Bozlak\\Desktop\\turkcellJava301\\ioOperations\\ornek.txt");

        // if (!file2.exists()) {
        //     try {
        //         file2.createNewFile();
        //     } catch (Exception e) {
        //         System.out.println(e.getMessage());
        //     }
        // }

        if (file2.exists()) {
           Boolean isDeleted =  file2.delete();
           System.out.println("ornek.txt dosyası silindi mi : " + isDeleted);
        }

        System.out.println("-------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dosya yolu : ");
        String path = scanner.nextLine();
        scanner.close();
        File file3 = new File(path);
        String[] centents =  file3.list();  // list() metodu cmd'deki dir görevi görüyor.
        for (String content : centents) {
            System.out.println(content);
        }
    }
}
