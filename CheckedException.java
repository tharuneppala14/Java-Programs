package com.exception.handeling;

import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("file.txt"); // checked exception
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}