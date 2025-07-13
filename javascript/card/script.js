const conts = [
    {
        nome: "Sample Games",
        descricao: "Desenvolvimento de jogos."
    },
    {
        nome: "Tião Cervejas",
        descricao: "Malte de qualidade."
    },
    {
        nome: "Moldsoft Tecnologia",
        descricao: "Acessoria e tecnologia."
    }
];

function exibirconts() {
    const contCards = document.getElementById('conts');

    conts.forEach(cont => {

        const card = document.createElement('section');
        card.className = 'card-cont';
        card.innerHTML = `
            <h1>${ cont.nome }</h1>
            <p>${ cont.descricao }</p>
        `;

        contCards.appendChild(card);
    });
}

document.addEventListener('DOMContentLoaded', exibirconts);
