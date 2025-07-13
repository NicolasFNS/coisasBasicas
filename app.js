const num = document.getElementById('input');

function mostraNum(){
    num.oninput = () => {
        console.log("num:"+ num.value);
    };
}

document.addEventListener('DOMContentLoaded', mostraNum);

function contar(){
    
    let cont = num.value;
    while(cont > 0){
        cont--;
        console.log("olha:"+ cont);
    }
}