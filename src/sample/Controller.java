package sample;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Controller {
    MongoClientURI uri = new MongoClientURI(
            "mongodb+srv://<kkingsbe>:<BCCBarons2016!>@moneyapp-qcubp.mongodb.net/test?retryWrites=true");

    MongoClient mongoClient = new MongoClient(uri);

    MongoDatabase database = mongoClient.getDatabase("moneyApp");
    MongoCollection<Document> Messages = database.getCollection("Messages");
    BasicDBObject document = new BasicDBObject();
    document.put("name", "Shubham");
    document.put("company", "Baeldung");
    Messages.insert(document);
}
