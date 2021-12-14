package com.rayucan.designparttern.BehavioralPatterns.IteratorPattern;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/9 17:30
 * 
 * 自定义数组集合
 * 通过迭代器模式，实现倒序遍历
 * 
 * 注意：涉及到多线程访问，当一个线程正在迭代集合，另一个线程修改集合
 * 就需要斟酌是否继续迭代，还是抛出异常
 */
public class MyArrayCollection<T> implements Iterable<T> {
    private T[] array;

    public MyArrayCollection(T... objs) {
        this.array = Arrays.copyOfRange(objs,0,objs.length);
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
    
    //通过内部类实现 Iterator
    class ReverseIterator implements Iterator<T>{

        int index;

        public ReverseIterator() {
            //索引设置在数组末尾
            this.index = MyArrayCollection.this.array.length;
        }

        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public T next() {
            //索引前移，并返回下一个的元素
            index--;
            return array[index];
        }
    }
}
