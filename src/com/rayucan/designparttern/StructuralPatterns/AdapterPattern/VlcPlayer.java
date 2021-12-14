package com.rayucan.designparttern.StructuralPatterns.AdapterPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 23:07
 */
public class VlcPlayer implements SuperMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Play vlc:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
