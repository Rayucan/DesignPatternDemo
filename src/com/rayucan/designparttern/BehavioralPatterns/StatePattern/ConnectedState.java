package com.rayucan.designparttern.BehavioralPatterns.StatePattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/10 16:40
 */
public class ConnectedState implements State{
    @Override
    public String init() {
        return "Hello!I am your dad!";
    }

    @Override
    public String reply(String input) {
        if (input.endsWith("?") || input.endsWith("？")){
            return "Yes." + input.substring(0, input.length() - 1) + "!";
        }
        
        if (input.endsWith(".") || input.endsWith("。")){
            return input.substring(0, input.length() - 1) + "!";
        }
        
        return input.substring(0, input.length()) + "?";
    }
}
