package designpatterns.adapter.repository.impl;

import designpatterns.adapter.repository.interfaces.DBInterface;

public class OracleDBImpl implements DBInterface {

    @Override
    public void insert(String value) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Oracle DB inserting data: " + value);
        System.out.println("");
    }

    @Override
    public void update(String value) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Oracle DB updatind data: " + value);
        System.out.println("");
    }

    @Override
    public void select(String value) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Oracle DB Select from table " + value);
        System.out.println("");
    }

    @Override
    public void delete(String value) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Oracle DB deleting data: " + value);
        System.out.println("");
    }
}
