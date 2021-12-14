package com.rayucan.designparttern.StructuralPatterns.AdapterPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 23:05
 */
public interface LowMediaPlayer {
    /**
     * 默认仅支持 mp3 音乐格式，不支持 mp4 vlc
     * @param audioType
     * @param fileName
     */
    void play(String audioType, String fileName);
}
