const createLista = (lista,tabela) => {
    console.log("a")

    let arrayObjetosKeys = Object.keys(lista);
  

    for (let i = 0; i < arrayObjetosKeys.length; i++) {
        let arrayKey = Object.keys(lista[arrayObjetosKeys[i]]);
        let arrayValue = Object.values(lista[arrayObjetosKeys[i]]);
        let tr = document.createElement("tr");

        for (let j = 0; j < arrayValue.length; j++) {
            let td = document.createElement("td");
            console.log(td)
            console.log("abc")
            td.innerHTML = arrayValue[j];
            tr.appendChild(td)
        }
        tabela.appendChild(tr)
    }
}

export default createLista;



