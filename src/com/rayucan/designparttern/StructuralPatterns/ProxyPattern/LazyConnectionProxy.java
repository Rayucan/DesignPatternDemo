package com.rayucan.designparttern.StructuralPatterns.ProxyPattern;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.function.Supplier;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/8 22:38
 */
public class LazyConnectionProxy extends AbstractConnectionProxy{
    private Supplier<Connection> supplier;
    private Connection target = null;
    
    public LazyConnectionProxy(Supplier<Connection> supplier){
        this.supplier = supplier;
    }
    
    public void close() throws SQLException {
        if (target != null){
            System.out.println("Close Connection:" + target);
            super.close();
        }
    }
   
    @Override
    protected Connection getRealConnection() {
        if (target == null){
            target = supplier.get();
        }
        
        return target;
    }
}
