package com.rayucan.designparttern.StructuralPatterns.AdapterPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 23:08
 */
public class MediaAdapter implements LowMediaPlayer {
    SuperMediaPlayer superMediaPlayer;
    
    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("VLC")){
            superMediaPlayer = new VlcPlayer();
        }else if (audioType.equalsIgnoreCase("MP4")){
            superMediaPlayer = new Mp4Player();
        }
    }
    
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("VLC")){
            superMediaPlayer.playVlc(fileName);
        }else if (audioType.equalsIgnoreCase("MP4")){
            superMediaPlayer.playMp4(fileName);
        }
    }
}
