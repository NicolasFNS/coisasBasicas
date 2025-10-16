
//informações que ficam em cada card
const elementos = [
    { nome: "Sample Games", descricao: "Desenvolvimento de jogos." },
    { nome: "Tião Cervejas", descricao: "Malte de qualidade." },
    { nome: "Moldsoft Tecnologia", descricao: "Acessoria e tecnologia." }
];

//filtra os dados acima e insere no html
function pesquisaElemento() {

    //seção que irá conter os elementos
    const elementoCards = document.getElementById('elementos');
    //input de pesquisa
    const pesquisa = document.getElementById('pesquisa');

    //necessário para a página não ser carregada vazia (por causa da linha do final do código)
    //fiz dessa forma por ser a mais simples para inserir pesquisa
    exibirelementos(elementos, elementoCards);

    pesquisa.oninput = () => {
        const valor = pesquisa.value.toLowerCase();
        const elementosFiltrados = elementos.filter(elemento => 
            elemento.nome.toLowerCase().includes(valor) ||
            elemento.descricao.toLowerCase().includes(valor)
        );
      
        elementoCards.innerHTML = ''; 
        exibirelementos(elementosFiltrados, elementoCards);
    };
}

//insere o html dos cards
function exibirelementos(elementos, container) {
    elementos.forEach(elemento => {
        const card = document.createElement('section');
        card.className = 'card-elemento';
        card.innerHTML = `
            <h1>${ elemento.nome }</h1>
            <p>${ elemento.descricao }</p>
        `;
        container.appendChild(card);
    });
}

document.addEventListener('DOMContentLoaded', pesquisaElemento);
