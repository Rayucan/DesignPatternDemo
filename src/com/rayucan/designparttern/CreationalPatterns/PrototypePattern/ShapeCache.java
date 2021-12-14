package com.rayucan.designparttern.CreationalPatterns.PrototypePattern;

import java.util.HashMap;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/2 22:52
 */
public class ShapeCache {
    //用 HashMap 模拟数据库缓存
    private static HashMap<String, Shape> shapeMap = new HashMap<>();
    
    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
    
    //每种形状都进行数据库查询，并创建
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
