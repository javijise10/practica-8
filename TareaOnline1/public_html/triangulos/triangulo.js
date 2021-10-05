
function triangulo(){
var l1 = prompt("Longitud lado 1");
var l2 = prompt("Longitud lado 2");
var l3 = prompt("Longitud lado 3");




if ((l1 + l2) > l3 && (l1 + l3) > l2 && (l2 + l3) > l1) {
    document.write("se forma un triángulo: ");


    if (l1 === l2 && l2 === l3) {

        document.write("triangulo equilatero");

    } 

    else if (      (l1 === l2) && (l2 !== l3)  (l2 === l3) && (l3 !== l1)  (l1 ===l3) && (l3 !== l1)       ) {

        document.write("Triangulo isosceles");

    }

    else  if ((l1 !== l2 )&&(l1 !== l3) &&(l2 !== l3) && (l2 !== l1)  && (l3 !== l2) && (l3 !== l1) )  {

    document.write("triangulo escaleno");




}
}

else {
    document.write("No se puede formar un triangulo");
}



}
