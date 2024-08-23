// //console.log(`Hello`);

// // window.alert("This is an alert");

// document.getElementById("Myh1").textContent="Hello World";

// document.getElementById("Myp").textContent="This is my frist java script program";
// // {
// // let x=10;
// // //document
// // }
// let age=25; 
// // console.log(typeof age);
// // console.log("You are "+age+" years old");
// document.getElementById("p1").textContent="Your age is "+age+" years";

let username;

// username=window.prompt("Whats your name: ");

// document.getElementById("p1").textContent=username;

document.getElementById("Mybutton").onclick=function(){
    username=document.getElementById("Mytext").value;
    document.getElementById("Myp").textContent=username;
}

document.getElementById("p3").textContent=username;
