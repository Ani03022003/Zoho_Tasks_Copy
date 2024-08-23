let hour=0;
let minutes=0;
let seconds=0;
let a;
document.getElementById("view").textContent="00:00:00";

function startClock(){
    seconds++;
    if(seconds%60==0){
        minutes++;
        seconds=0;
    }
    if(minutes%60==0 && minutes!=0){
        hour++;
        minutes=0;
    }
    hour=addition(hour);
    minutes=addition(minutes);
    seconds=addition(seconds);
    document.getElementById("view").textContent=hour+":"+minutes+":"+seconds;

}
function addition(number){
    let val='0'+number;
    if(val.length<=2)
        return val;
    return number;
}
function start(){
    a=setInterval(startClock,1000);
    console.log("In Start function");
}
function reset(){
    document.getElementById("view").textContent="00:00:00";
    clearInterval(a);
    hour=0;
    minutes=0;
    seconds=0;
}
