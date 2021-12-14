package com.rayucan.designparttern.BehavioralPatterns.CommandPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 16:43
 */
public class CopyCommand implements Command{
    private TextEditor receiver;

    public CopyCommand(TextEditor receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.copy();
    }
}
