const entidades = document.getElementsByClassName("entidade");

console.log(entidades);
function abrirModal() {
    window.open("#abrirModal", "_self")
}

Array.from(entidades).forEach(element => {
    element.addEventListener("click",abrirModal);
});

const getEntidades = () => {
    
}
