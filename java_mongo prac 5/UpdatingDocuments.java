import java.net.UnknownHostException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;
public class UpdatingDocuments
{
public static void main(String [] args)
{
MongoClient mongo = new MongoClient("localhost",27017);
DB db= mongo.getDB("mydb1");
DBCollection col = db.getCollection("SampleCollection");
DBObject query = new BasicDBObject("id",1);
DBObject update = new BasicDBObject();
update.put("$set",new BasicDBObject("likes",400));
WriteResult result = col.update(query, update);
//mongo.close();
}
}
