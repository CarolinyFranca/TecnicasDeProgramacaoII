public abstract class Pizza {
    private String nome;
    private double valor;
    private String[] ingredientes;

    public Pizza(String nome, double valor, String[] ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " { " +
                "valor: "+ valor +
                "nome: " + nome + '\'' +
                "ingredientes: " + ingredientes +
                '}';

    }
}