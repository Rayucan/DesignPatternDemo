package com.rayucan.designparttern.StructuralPatterns.AdapterPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 23:06
 */
public interface SuperMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
