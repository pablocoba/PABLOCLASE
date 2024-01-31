
function uno(){
    let x = alert("Soy el primer script");
    console.log("Hola Mundo!");
}
function aray(){
    let x = [1,2,3,4,5,6,7,8,9,10,11,12]
    let i = 0;
    for(i = 0; i < x.length; i++){
        document.writeln(x[i])
    }
    }
function valores(){
    let valores = [true, 5, false, "hola", "adios", 2];
    let cont = 0;
    let cont2 = 0;
    let i = 0;
    for(i = 0; i < valores.length; i++){
        if(valores[i] === true || valores[i] === false){
            cont == i;
            document.writeln(`bool encontrado en la posicion:${i}: "${valores[i]}"`)
        }
        else if(valores[i] === true || valores[i] === false && cont != 0){
            cont2 == i;
            document.writeln(`bool encontrado en la posicion:${i}: "${valores[i]}"`)
        }
    }

}