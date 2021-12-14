package com.rayucan.designparttern.BehavioralPatterns.StatePattern;

import java.util.Scanner;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/10 16:46
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BotContext botContext = new BotContext();
        
        while (true){
            System.out.print("> ");
            String input = scanner.nextLine();
            String output = botContext.chat(input);
            System.out.println(output.isEmpty() ? "NO REPLY" : "> " + output);
        }
    }
}
