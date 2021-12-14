package com.rayucan.designparttern.BehavioralPatterns.StatePattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/10 16:36
 */
public class DisconnectedState implements State{

    @Override
    public String init() {
        return "Bye!";
    }

    @Override
    public String reply(String input) {
        return "";
    }
}
