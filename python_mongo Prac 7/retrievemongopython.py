from pymongo import MongoClient
client = MongoClient('localhost:27017')
db = client.mydb7
def read():
    try:
        Col = db.MyCol.find()
        print("\n All data from EmployeeData Database \n")
        for Mycol in Col:
            print(Mycol)
    except Exception:
        print(str("error"))

read()
