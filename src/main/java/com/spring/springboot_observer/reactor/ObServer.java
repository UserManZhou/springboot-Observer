package com.spring.springboot_observer.reactor;

import org.springframework.web.reactive.DispatcherHandler;
import org.springframework.web.server.WebHandler;

import java.util.Observable;
import java.util.Observer;

public class ObServer extends Observable {

    public static void main(String[] args) {
        ObServer obServer = new ObServer();
        // 添加观察者
        obServer.addObserver((observable,arg) -> {
            System.out.println("发生变化" + "\t"+observable+"\t"+arg);
        });

        obServer.addObserver((observable,arg) -> {
            System.out.println("准备发生改变"+"\t"+observable+"\t"+arg);
        });

        obServer.setChanged(); // 进行数据地变化
        obServer.notifyObservers(); // 通知数据已变化
    }
}
