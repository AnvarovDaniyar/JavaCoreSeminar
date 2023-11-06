package org.example.hw4.ex1;

import java.util.Scanner;

public class LoginValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин: ");
        String login = scanner.nextLine();

        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        System.out.print("Подтвердите пароль: ");
        String confirmPassword = scanner.nextLine();

        try {
            boolean result = validateLoginAndPassword(login, password, confirmPassword);
            System.out.println("Validation result: " + result);
        } catch (WrongLoginException e) {
            System.out.println("WrongLoginException: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("WrongPasswordException: " + e.getMessage());
        }

        scanner.close();
    }

    public static boolean validateLoginAndPassword(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20) {
            throw new WrongLoginException("Login length should be less than 20 characters");
        }

        if (password.length() >= 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password length should be less than 20 characters and must match the confirmation password");
        }

        return true;
    }
}