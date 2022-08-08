console.log("js is working");
var name = 23;
name = "hello";
console.log(name+11);
console.log("world"+name);

// alert(" Hey, It's monday again");
// window.confirm("sometext");

// window.prompt("sometext","defaultText");
// let person = prompt("Please enter your name", "Harry Potter");
// let text;
// if (person == null || person == "") {
//   text = "User cancelled the prompt.";
// } else {
//   text = "Hello " + person + "! How are you today?";
// }
// console.log(text);

let flavours=["strawberry","choclate","vanilla","pista"];
console.log(flavours[1]); //choclate
console.log(flavours[3]);  //pista
flavours[2] = "butterscotch";
console.log(flavours[2]);  //butterscotch
flavours[4] ="blackcurrent";

let status = 200;
let msg;
if(status === 200){
msg = "success";
}else{
    msg = "error";
}
console.log(msg); // success
console.log(flavours.length);

flavours.push("potter");

for(var i = 0; i<flavours.length;i++){
    console.log(flavours[i]);
}
console.log(i);
