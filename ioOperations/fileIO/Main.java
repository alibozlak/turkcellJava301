package ioOperations.fileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dosya yolu : ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                boolean isFileCreated = file.createNewFile();
                if (isFileCreated) {
                    System.out.println("Dosya oluşturuldu!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileWriter fileWriter = null;
        try {
            fileWriter  = new FileWriter(file);
            String inputLine = null;
            System.out.println("Dosyaya yazılacak text : ");
            do {
                inputLine = scanner.nextLine();
                fileWriter.write(inputLine);
                fileWriter.write(System.lineSeparator());
            } while (!inputLine.equalsIgnoreCase("quit"));
            System.out.println("Dosyaya yazdırıldı!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Dosya boyutu : " + file.length() + " byte");

        scanner.close();
    }
}
