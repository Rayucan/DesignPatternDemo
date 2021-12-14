package com.rayucan.designparttern.BehavioralPatterns.StatePattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/10 16:36
 * 
 * 所有状态的公共接口
 * 包括在线状态、离线状态
 */
public interface State {
    /**
     * 切换到某状态时发送的信息
     * @return
     */
    String init();
    
    String reply(String input);
}
