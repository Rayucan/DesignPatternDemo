package com.rayucan.designparttern.BehavioralPatterns.StatePattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/10 16:45
 */
public class BotContext {
    private State state = new DisconnectedState();

    /**
     * 需要切换状态时，管理员发送的消息
     * hello切换到在线状态
     * bye切换到离线状态
     * @param input
     * @return
     */
    public String chat(String input){
        if ("hello".equalsIgnoreCase(input)){
            state = new ConnectedState();
            return state.init();
        }else if ("bye".equalsIgnoreCase(input)){
            state = new DisconnectedState();
            return state.init();
        }
        return state.reply(input);
    }
}
