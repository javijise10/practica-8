
function vercalificacion(numero){
    


//var numero = prompt("DAME TU NOTA");

switch (numero) {

    case "1":
    case "2":
    case "3":
    case "4":
        document.write('INSUFICIENTE');
        break;

    case "5":
    case "6":
        document.write('BIEN');
        break;

    case "7":
    case "8":
        document.write('NOTABLE');
        break;

    case "9":

    case "10":
        document.write('SOBRESALIENTE');
        break;
    default :
        document.write("ERROR , DEBE DE INTRODUCIR UN NUMERO DEL 1 AL 10");
        break;

        
}
}

