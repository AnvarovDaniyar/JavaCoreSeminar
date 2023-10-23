package org.example;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Notes {
    private static final String FILE_PATH = "notes.txt";

    public void addNote() {
        System.out.println("Введите заметку: ");
        Scanner scanner = new Scanner(System.in);
        String note = scanner.nextLine();

        String timestamp = Time.getTimestamp();
        String timestampedNote = "Дозапись в файл: " + timestamp + " -> " + note;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(timestampedNote);
            writer.newLine();
            System.out.println(timestampedNote);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
