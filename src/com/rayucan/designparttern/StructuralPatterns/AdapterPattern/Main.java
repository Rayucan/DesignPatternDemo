package com.rayucan.designparttern.StructuralPatterns.AdapterPattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 23:15
 */
public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        
        audioPlayer.play("mp3","Hop.mp3");
        audioPlayer.play("mp4","2233更衣室.mp4");
        audioPlayer.play("vlc","新宝岛.vlc");
        
        audioPlayer.play("exe","黑暗之魂3.exe");
    }
}
