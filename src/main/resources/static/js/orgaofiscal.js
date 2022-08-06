import createLista from "./view.js"

let bota = document.getElementById("botar");
let tabela = document.getElementById("tabela");


let lista = {
    obj1: {
        id: 111111111111111111,
        name: "value",
        description: "teste"
    },
    obj2: {
        id: 2,
        name: "joji",
        description: "node"
    },
    obj3: {
        id: 23,
        name: "lucas",
        description: "chora"
    }
}


bota.addEventListener("click", function () {
    createLista(lista,tabela);
})

