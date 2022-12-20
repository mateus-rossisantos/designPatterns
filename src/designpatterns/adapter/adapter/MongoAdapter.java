package designpatterns.adapter.adapter;

import designpatterns.adapter.mongodb.MongoDBCommands;
import designpatterns.adapter.repository.interfaces.DBInterface;

public class MongoAdapter implements DBInterface {

    private MongoDBCommands mongoDBCommands;

    public MongoAdapter() {
        this.mongoDBCommands = new MongoDBCommands();
    }

    @Override
    public void insert(String value) throws InterruptedException {
        mongoDBCommands.insertMongo(value);
    }

    @Override
    public void update(String value) throws InterruptedException {
        mongoDBCommands.updateMongo(value);
    }

    @Override
    public void select(String value) throws InterruptedException {
        mongoDBCommands.find(value);
    }

    @Override
    public void delete(String value) throws InterruptedException {
        mongoDBCommands.exclude(value);
    }
}
