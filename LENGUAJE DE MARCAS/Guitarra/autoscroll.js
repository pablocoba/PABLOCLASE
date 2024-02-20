let scrollerID;
let paused = true;
let speed = 1; // 1 - Fast | 2 - Medium | 3 - Slow
let interval = speed * 30;

function butAppear(){
    document.getElementById("scrollMore").style.visibility = "visible";
    document.getElementById("scrollLess").style.visibility = "visible";
}

function startScroll(){
    let id = setInterval(function() {
        window.scrollBy(0, speed);
        if ((window.innerHeight + window.scrollY) >= document.body.offsetHeight) {
            // Reached end of page
            stopScroll();   
        }
    }, interval);
    return id;
}

function stopScroll() {
    clearInterval(scrollerID);
}

function lessScroll(){
    if(speed!=4){
        speed++;
    }

}
function moreScroll(){
    if(speed!=1){
        speed--;
    }
    }
let more = document.querySelector("#scrollMore");

more.addEventListener("click",lessScroll);

let less = document.querySelector("#scrollLess");

less.addEventListener("click",moreScroll);


let but = document.querySelector("#autoscr");
but.addEventListener('click', function (event)
{
        console.log(speed);
        if(paused == true) {
            scrollerID = startScroll();
            paused = false;
        }
        else {
            stopScroll();
            paused = true;
        }
    
}, true);