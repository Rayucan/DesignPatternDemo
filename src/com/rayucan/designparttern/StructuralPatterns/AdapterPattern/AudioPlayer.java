package com.rayucan.designparttern.StructuralPatterns.AdapterPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 23:12
 */
public class AudioPlayer implements LowMediaPlayer {
    MediaAdapter mediaAdapter;
    
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("MP3")){
            
            System.out.println("Play mp3:" + fileName);
            
        }else if (audioType.equalsIgnoreCase("MP4") || audioType.equalsIgnoreCase("VLC")){
            
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
            
        }else {
            System.out.println("格式错误!!!");
        }
    }
}
