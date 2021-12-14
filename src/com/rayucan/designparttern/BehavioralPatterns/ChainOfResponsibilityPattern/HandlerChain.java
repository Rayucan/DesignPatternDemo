package com.rayucan.designparttern.BehavioralPatterns.ChainOfResponsibilityPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 16:15
 */
public class HandlerChain {
    private List<Handler> handlers = new ArrayList<>();
    
    public void addHandler(Handler handler){
        this.handlers.add(handler);
    }
    
    public boolean process(Request request){
        for (Handler handler : handlers) {
            Boolean isProcessed = handler.process(request);
            
            if (isProcessed != null){
                System.out.println(
                        request + 
                        " " + 
                        (isProcessed ? "Approved by" : "Denied by") + 
                        " " +
                        handler.getClass().getSimpleName());
                
                return isProcessed;
            }
        }
        throw new RuntimeException("Could not handle request:" + request);
    }
}
