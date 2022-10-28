package ioOperations.dosyaAkislari;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Dosya Akışları
 */
class Main {

    public static void main(String[] args) {
        File file = new File("hello.txt");

        // FileOutputStream fileOutputStream = null;
        // try {
        //     fileOutputStream = new FileOutputStream(file);
        //     fileOutputStream.write("Merhaba".getBytes());
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // } finally {
        //     try {
        //         fileOutputStream.close();
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        // }

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            int c = 0;
            while ((c = fileInputStream.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}