package designpatterns.adapter.mongodb;

public class MongoDBCommands {

    public void insertMongo(String value){
        System.out.println("MongoDB inserting " + value);
        System.out.println("");
    }

    public void updateMongo(String value){
        System.out.println("MongoDB updating " + value);
        System.out.println("");
    }

    public void find(String value){
        System.out.println("MongoDB finding " + value);
        System.out.println("");
    }

    public void exclude(String value){
        System.out.println("MongoDB deleting " + value);
        System.out.println("");
    }

}
