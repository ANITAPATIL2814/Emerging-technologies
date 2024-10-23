import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import com.mongodb.MongoClient;
import org.bson.Document;
public class DelectingDoc{
	public static void main(String args[])
	{
		MongoClient mongo=new MongoClient("localhost",27017);
//creating a mongo client
		System.out.println("connected to the database successfully");

		MongoDatabase database=mongo.getDatabase("mydb1");//accessing the db

		MongoCollection<Document> collection =database.getCollection("SampleCollection"); //accessing collection
		System.out.println("Collection sampleCollection selected successfully");

		//deleting doc
		collection.deleteOne(Filters.eq("id",1));
		System.out.println("document deleted successfully");
	}
}