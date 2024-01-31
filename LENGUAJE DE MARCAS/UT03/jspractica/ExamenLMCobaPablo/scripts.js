let l = parseInt(prompt("Dame la base del rectángulo"));
let h = parseInt(prompt("Dame la altura del rectángulo"));
console.log(l)
console.log(h)

function lado(){

    document.getElementById("cuad").style.width = l+"px";
    document.getElementById("cuad").style.height = h+"px";
    document.getElementById("cuad").style.backgroundColor = "chocolate";
    document.getElementById("text").innerHTML="Examen rectángulo";
    document.getElementById("text").style.visibility = "visible";

}
function cambiarLado(){
    l = parseInt(prompt("Dame la base del rectángulo"));
    console.log(l);
    h = parseInt(prompt("Dame la altura del rectángulo"));
    console.log(h);
    document.getElementById("cuad").style.width = l+"px";
    document.getElementById("cuad").style.height = h+"px";
    document.getElementById("cuad").style.backgroundColor = "chocolate";
    document.getElementById("text").innerHTML="Examen rectángulo";
    document.getElementById("text").style.visibility = "visible";
}
function color(){
    let rnd = parseInt(Math.random()*255);
    let rnd2 = parseInt(Math.random()*255);
    let rnd3 = parseInt(Math.random()*255);
    console.log(rnd);
    console.log(rnd2);
    console.log(rnd3);
    document.getElementById("cuad").style.backgroundColor = "rgb("+rnd+", "+rnd2+", "+rnd3+")";
}
function area(){
    document.getElementById("par").innerHTML="Área: "+l*h;
}
function perimetro(){
    document.getElementById("par").innerHTML="Perímetro: "+parseInt((2*l)+(2*h));
}