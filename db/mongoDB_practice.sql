mongo

show databases;

show dbs;
use DATABASE_NAME;
db.hex2db.insert({name:"uma"}) ;
db.dropdatabase;

 db.createCollection('food' );
 show collections;
 db.createCollection('vacation' );
 db.food.insert({name:"briyani",level:"highly spicy"})
 
 -------drop collection------------
  db.vacation.drop();
--------------
db.food.find();
db.food.insert([{name:"pav bhaji"},{name:"dosa",level:"mild"},{name:"aaa",age:5,school:"kdjlkd"} ]);
try insert many as wsell
db.food.find().pretty();
db.food.find().limit(3);

db.food.find().skip(2);

 db.food.find().limit(2).skip(2);
 -------------------
db.food.find().sort({"name":-1})
 db.food.findOne({name:'chicken pizza'})
 
  db.food.update({'name':'chicken pizza'},{$set:{toppings: 'tomato'}})

------------------save------------------
> db.food.save({ "name" : "chicken pizza", "level" : "moderate","toppings":'olives'})
//above is without id, so new documen is created.

--------------save with id , existing doc is replaced-----------------
 db.food.save({ "_id" : ObjectId("62d1138c6926b0f6c3ac14c2"), "name" : "dosa", "level" : "spicy","total":3,"price":5});
 
 ------------------------
 
  db.food.remove({name:"dosa"});
