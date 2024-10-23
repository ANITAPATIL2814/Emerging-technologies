import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import org.bson.Document;
public class insertingDoc{
	public static void main(String args[])
	{
		MongoClient mongo=new MongoClient("localhost",27017);//creating a mongo client
		System.out.println("connected to the database successfully");

		MongoDatabase database=mongo.getDatabase("mydb1");//accessing the db

		MongoCollection<Document> collection =database.getCollection("SampleCollection"); //accessing collection
		System.out.println("Collection sampleCollection selected successfully");

		Document document= new Document();
		document.append("id",1);
		document.append("description","aa");
		document.append("likes",100);
		document.append("url","http://www.anu.com");
		document.append("by"," New Framework");
		document.append("project_by","aa");
		
		collection.insertOne(document);
		System.out.println("Document inserted successfully");
	}
}