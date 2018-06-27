package sample;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class Controller {
    MongoClientURI uri = new MongoClientURI(
            "mongodb+srv://kay:BCCBarons2016!@cluster0.mongodb.net/");

    MongoClient mongoClient = new MongoClient(uri);
    MongoDatabase database = mongoClient.getDatabase("moneyApp");


}
