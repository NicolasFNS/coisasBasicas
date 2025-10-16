/*codigos alternativos*/
//comentarios dos codigos (sempre abaixo do codigo explicado) ou linha de código única

const num = document.getElementById('input');
const vis = document.getElementById('visor');
const btn = document.getElementById('btn');

const btncor = document.querySelectorAll("button");

function mostraNum(){
    num.oninput = () => {
        console.log("num:"+ num.value);
        vis.innerHTML = num.value;
    };
}

document.addEventListener('DOMContentLoaded', mostraNum);

btn.onclick = function() {
    let cont = num.value;
    while (cont > 0) {
        cont--;
        console.log("olha:" + cont);
    }
}
//apenas para exemlplo, também dá para usar "btn.addEventListener ("click", function() {"

/*
btncor.forEach(function(button) {
    button.addEventListener("click", function() {
        const cor = this.classList;
        //button.style.color = cor;

        btncor.forEach(function(botao){
            botao.style.color = cor;
        });
        //tem que ter outro foreach por que o primeiro é para adicionar uma função para cada botão, mas as alterações valem apenas naquela execução de click naquele item específico (a função de click é vista como individual para cada), então se quiser fazer algo que afete mútiplos terá que dizer novamente para fazer em um por um
    });
});
*/

/*
btncor.forEach(function(button) {
    button.addEventListener("click", function() {
        const cor = this.classList;
        button.style.color = cor;
    });
});
*/
//o código acime muda a cor do texto do botão selecionado

btncor.forEach(function(button) {
  button.addEventListener("click", function() {

    /*
    btncor.forEach(function(btn) {
      btn.classList.remove("active");
    });
    this.classList.add("active");
    const cor = this.classList [0];
    //necessário por ter adicionado uma palavra, se não colocar o retorno da variável cor será, por exemplo, "blue active"
    */
    //o código acima é uma alternatica para caso você precise selecionar apenas o que está ativo no futuro

    const cor = this.classList;
    //também funciona com this.id/name se o id ou name tiver nome de cor
    const visor = document.getElementById("visor");
    visor.style.color = cor;

    //console.log(button.textContent)
    //loga o conteúdo do botão (foi apenas um teste)

  });
});
//muda a cor do texto do "visor"
