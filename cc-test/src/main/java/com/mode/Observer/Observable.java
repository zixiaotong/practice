package com.cn.mode.Observer;//package com.online.cn.com.mode.Observer;
//
//import java.util.ArrayList;
//import java.util.listdemo;
//
///**
// * Created by shanglei on 2017/6/13.
// */
//public class Observable {
//
//    listdemo<Observer> observers = new ArrayList<>();
//
//    public void addObserver(Observer o){
//        observers.add(o);
//    }
//
//    public void changed(){
//        System.out.println("���Ǳ��۲��ߣ����Ѿ������仯��");
//        notifyObservers();
//    }
//
//    public void notifyObservers(){
//        for (Observer observer : observers) {
//            observer.update(this);
//        }
//    }
//}