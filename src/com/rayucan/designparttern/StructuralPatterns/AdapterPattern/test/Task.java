package com.rayucan.designparttern.StructuralPatterns.AdapterPattern.test;

import java.util.concurrent.Callable;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/8 0:12
 */
public class Task implements Callable<Long> {
    private long num;
    
    public Task(long num){
        this.num = num;
    }
    
    @Override
    public Long call() throws Exception {
        long r = 0;
        
        for (long n = 1 ; n <= this.num ; n++){
            r += n;
        }

        System.out.println("Result:" + r);
        
        return r;
    }

    public static void main(String[] args) {
        Callable<Long> callable = new Task(114514L);
    }
}
