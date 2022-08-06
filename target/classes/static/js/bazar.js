let entidades = document.getElementsByClassName("entidade");
const blockEntidades = document.getElementById("entidades");
const blockLotes = document.getElementById("lotes");

console.log(entidades);
function abrirModal() {
    window.open("#abrirModal", "_self")
}



const addOpenModal = () => {
    entidades = document.getElementsByClassName("entidade");
    Array.from(entidades).forEach(element => {
        element.addEventListener("click", abrirModal);
    });
}

addOpenModal();


const getEntidades = () => {

}

let teste = {
    nome: "hospital",
    endereco: "vale do siriji",
    horario: "01:00 as 12:00",
    telefone: 345851367
}

let lote = {
    batch_id: 098,
    deliverDate: "18 / 09 / 2012",
    observation: "a",
    produtos: {
        produto1: {
            nome: "teste",
            descricao: "1"
        },
        produto2: {
            nome: "teste",
            descricao: "2"
        }

    }
}

const createEntidade = (entidade = teste) => {
    let div = document.createElement("div");
    div.classList.add("entidade");

    let spanNome = document.createElement("span");
    spanNome.classList.add("nome");
    spanNome.innerHTML = entidade.nome;
    console.log(entidade.nome);

    let spanEndereco = document.createElement("span");
    spanEndereco.classList.add("endereco");
    spanEndereco.innerHTML = entidade.endereco;

    let spanHorario = document.createElement("span");
    spanHorario.classList.add("horario");
    spanHorario.innerHTML = entidade.horario;

    let spanTelefone = document.createElement("span");
    spanTelefone.classList.add("telefone");
    spanTelefone.innerHTML = entidade.telefone;

    div.appendChild(spanNome);
    div.appendChild(spanEndereco);
    div.appendChild(spanHorario);
    div.appendChild(spanTelefone);

    blockEntidades.appendChild(div)
    addOpenModal();
}

const createLote = (lote) => {
    let div = document.createElement("div");
    div.classList.add("lote");

    let spanID = document.createElement("span");
    spanID.classList.add("id");
    spanID.innerHTML = lote.batch_id;

    let spanDataEntrega = document.createElement("span");
    spanDataEntrega.classList.add("dataDeEntrega");
    spanDataEntrega.innerHTML = lote.deliverDate;

    div.appendChild(spanID);
    div.appendChild(spanDataEntrega);

    createProdutos(lote.produtos, div)


    blockLotes.appendChild(div);
}

const createProdutos = (produtos, divLote) => {
    let div = document.createElement("div");
    div.classList.add("produtos");

    let divLegendaProdutos = document.createElement("div");
    divLegendaProdutos.classList.add("legendaProdutos");

    let spanLegendaProduto = document.createElement("span");
    spanLegendaProduto.classList.add("legendaProduto");
    spanLegendaProduto.innerHTML = "Produto";


    let spanLegendaDescricao = document.createElement("span");
    spanLegendaDescricao.classList.add("legendaDescricao");
    spanLegendaDescricao.innerHTML = "Descricao"

    divLegendaProdutos.appendChild(spanLegendaProduto);
    divLegendaProdutos.appendChild(spanLegendaDescricao);

    div.appendChild(divLegendaProdutos);
    
    createProduto(produtos,div)

    divLote.appendChild(div);
}

const createProduto = (produto, divProdutos) => {
    let produtos = Object.keys(produto);

    for(let i = 0; i < produtos.length; i++) {
        console.log(produto)
        console.log(produto.produto1)
        console.log(produtos)
        let arrayValuesProduto = Object.values(produto[produtos[i]]);
        let div = document.createElement("div");
        div.classList.add("produto");
    
        let spanDescricao = document.createElement("span");
        spanDescricao.classList.add("descricao");
        spanDescricao.innerHTML = arrayValuesProduto[0]
    
        let spanNome = document.createElement("span");
        spanNome.classList.add("nome");
        spanNome.innerHTML = arrayValuesProduto[1]

    
        div.appendChild(spanDescricao);
        div.appendChild(spanNome);
        divProdutos.appendChild(div);
    }

}



document.getElementById("bota").addEventListener("click", function () {
    createLote(lote);
});