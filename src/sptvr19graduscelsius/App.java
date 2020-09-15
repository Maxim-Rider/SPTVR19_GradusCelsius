/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19graduscelsius;

import java.util.Scanner;
/**
 *
 * @author user
 */
class App { 
    private Scanner scanner = new Scanner(System.in);
    public void run () {
        System.out.println("Конвертер градусов Фаренгейта в градусы по Цельсию");
        System.out.print("Введите градусы по Фаренгейту");
        double gradF = scanner.nextDouble();
        System.out.print("По Цельсию это: ");
        double gradC = (gradF - 32) * 5 / 9;
        System.out.printf("%.2f%n",gradC);
    }
}