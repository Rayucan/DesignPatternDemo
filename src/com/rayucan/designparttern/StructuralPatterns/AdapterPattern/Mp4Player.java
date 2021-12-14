package com.rayucan.designparttern.StructuralPatterns.AdapterPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 23:08
 */
public class Mp4Player implements SuperMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Play mp4:" + fileName);
    }
}
