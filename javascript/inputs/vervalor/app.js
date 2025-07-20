const num = document.getElementById('input');
const vis = document.getElementById('visor');

function mostraNum(){
    num.oninput = () => {
        console.log("num:"+ num.value);
        vis.innerHTML = num.value;
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
