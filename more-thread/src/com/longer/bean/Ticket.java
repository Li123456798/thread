package com.longer.bean;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author longer
 * @create 2021-01-04 10:10
 */
public class Ticket {


    private Integer number = 300;
    private ReentrantLock lock = new ReentrantLock();

    public void saleTicket(){
        lock.lock();
        try {
            if (number > 0){
                number--;
                System.out.println("当前"+Thread.currentThread().getName()+"卖出第"+(number+1)+"张，还剩余"+number+"张");
            }

        }catch (Exception e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

}


}
