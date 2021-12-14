package com.rayucan.designparttern.BehavioralPatterns.CommandPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 16:44
 */
public class PasteCommand implements Command{
    private TextEditor receiver;

    public PasteCommand(TextEditor receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.paste();
    }
}
