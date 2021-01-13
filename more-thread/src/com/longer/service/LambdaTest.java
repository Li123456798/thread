package com.longer.service;

import com.longer.bean.Ticket;

/**
 * @author longer
 * @create 2021-01-04 10:09
 */
public class LambdaTest {
    public static void main(String[] args) {

        Ticket ticket = new Ticket();

//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    ticket.saleTicket();
//
//                }
//            },"a").start();

//            new Thread(()->{ for (int i = 0; i < 50; i++) {ticket.saleTicket();}},"A").start();

//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    ticket.saleTicket();
//
//                }
//            },"b").start();
//            new Thread(()->{  for (int i = 0; i < 500; i++) {ticket.saleTicket();}},"B").start();

//        Foo foo = () -> { System.out.println("sum...."); };
//        foo.sum();
        Foo foo = (x,y)->{return x*y;};
        System.out.println(foo.add(2, 3));
        System.out.println(foo.ad(2, 3));
        System.out.println(Foo.dele(5, 3));

    }

}

@FunctionalInterface
interface Foo{

    int add(int x, int y);

    default int ad(int x, int y) {
        return x+y;
    }

    static int dele(int x,int y){

        return x-y;
    }
}
