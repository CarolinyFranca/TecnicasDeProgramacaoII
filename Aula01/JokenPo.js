/*
Tesoura vence papel
Papel vence pedra
Pedra vence lagarto
Lagarto vence spock
Spock vence tesoura
Tesoura vence lagarto
Pedra vence tesoura
Papel vence spock
Spock vence pedra
Lagarto vence papel

*/


let pedra = document.getElementById('pedra');
let papel = document.getElementById('papel');
let tesoura = document.getElementById('tesoura');
let spock = document.getElementById('spock');
let lagarto = document.getElementById('lagarto');
let textoRes = document.getElementById('resultado');
let textop1 = document.getElementById('escolhap1');
let textop2 = document.getElementById('escolhap2');


let escolha = null;
let escolharandom = null;

pedra.addEventListener('click', function(){
    escolha =  "pedra";
    mostrarJogadaRandomizada();
})


papel.addEventListener('click', function(){
    
    escolha = "papel";
    mostrarJogadaRandomizada();

})


tesoura.addEventListener('click', function(){
    
    escolha = "tesoura";
    mostrarJogadaRandomizada();

})


lagarto.addEventListener('click', function(){
 
    
    escolha = "lagarto";
    mostrarJogadaRandomizada();

})

spock.addEventListener('click', function(){

    
    escolha = "spock";
    mostrarJogadaRandomizada();

})



const randomizarJogada = () => {
    const jogadas = ['pedra', 'papel', 'tesoura', 'lagarto', 'spock'];
    const index = Math.floor(Math.random() * jogadas.length);
    return jogadas[index];
}


const mostrarJogadaRandomizada = () =>{

    const jogada = randomizarJogada();

    escolharandom = jogada;

    validaResultado();
}

const validaResultado = () => {
    textop1.textContent = `Você escolheu ${escolha}`;
    textop2.textContent = `Jogador escolheu ${escolharandom}`;
   
    if(escolha == escolharandom){
        textoRes.textContent = "Empate";
    }else if(
        (escolha === 'tesoura' && (escolharandom === 'papel' || escolharandom === 'lagarto')) ||
        (escolha === 'papel' && (escolharandom === 'pedra' || escolharandom === 'spock')) ||
        (escolha === 'pedra' && (escolharandom === 'lagarto' || escolharandom === 'tesoura')) ||
        (escolha === 'lagarto' && (escolharandom === 'spock' || escolharandom === 'papel')) ||
        (escolha === 'spock' && (escolharandom === 'tesoura' || escolharandom === 'pedra'))
    ){
        textoRes.textContent = "Você ganhou";
    }else{
        textoRes.textContent = "Você perdeu";

    }
}

