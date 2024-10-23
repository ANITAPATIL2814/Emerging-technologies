from pymongo import MongoClient
client = MongoClient('localhost:27017')
db = client.mydb7
def update():
    try:
        name=input("\n Enter name to search\n")
        age=input("\n Enter age to update\n")
        db.MyCol.update_one(
                {"name":name},
                {"$set":{"age":age}}
        )
        print("\n Record updated successfully \n")
    except Exception:
        print(str("error"))
update()
