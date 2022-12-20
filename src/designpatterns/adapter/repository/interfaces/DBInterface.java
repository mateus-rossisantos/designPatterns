package designpatterns.adapter.repository.interfaces;

public interface DBInterface {

    void insert(String value) throws InterruptedException;

    void update(String value) throws InterruptedException;

    void select(String value) throws InterruptedException;

    void delete(String value) throws InterruptedException;
}
