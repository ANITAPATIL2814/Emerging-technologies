from pymongo import MongoClient
client=MongoClient('localhost',27017)
db=client.mydb7
def delete():
    try:
        name1 = input("Enter name:")
        db.MyCol.delete_one(
                {"name":name1}
            )
        print("\nDeletion successful\n")
    except(Exception):
        print(str("error"))
delete()
