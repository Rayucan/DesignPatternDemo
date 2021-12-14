package com.rayucan.designparttern.CreationalPatterns.PrototypePattern;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 22:47
 */
public abstract class Shape implements Cloneable{
    private String id;
    protected String type;
    
    abstract void draw();

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone(){
        Object clone = null;
        
        try {
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        
        return clone;
    }
}
