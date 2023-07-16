public class Pizzaria {
    private FactoryMethody factory;
    private Pizza pizza;

    public Pizzaria(FactoryMethody factory) {
        this.factory = factory;
    }

    void assar(Opcoes opcoes){
        pizza = factory.assar(opcoes);
    }

    public Pizza entregar(){
        System.out.printf("\nPizza %s entregue!\n", pizza.getNome());
        System.out.printf("O valor total de seu pedido foi de %s .\n", pizza.getValor());
        System.out.println("\n!!! Atenção alérgicos !!!");
        System.out.println("O pedido contém:");
        for (String ingrediente : pizza.getIngredientes()) {
            System.out.println(ingrediente);
        }
        return pizza;
    }
}
