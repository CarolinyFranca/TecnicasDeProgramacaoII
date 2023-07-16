public class FactoryMethody {

    public Pizza assar(Opcoes opcoes){
        switch (opcoes) {
            case CALABRESA: 
                return new Calabresa("Calabresa", 29.90, new String[]{
                    "Molho de tomate", 
                    "Calabresa", 
                    "Cebola", 
                    "Azeitona",
                    "Orégano"
                });
            case PORTUGUESA:
                return new Portuguesa("Portuguesa", 31.90, new String[]{
                    "Molho de tomate", 
                    "Presunto", 
                    "Queijo", 
                    "Ovo", 
                    "Cebola", 
                    "Azeitona", 
                    "Orégano"
                });
            case QUATRO_QUEIJOS:
                return new Queijo("Quatro Queijos", 30.90, new String[]{
                    "Molho de tomate", 
                    "Mussarela", 
                    "Gorgonzola", 
                    "Parmesão", 
                    "Provolone", 
                    "Orégano"
                });
            case CANGACEIRA:
                return new Cangaceira("Cangaceira", 32.90, new String[]{
                    "Molho de tomate", 
                    "Queijo", 
                    "Carne seca", 
                    "Cebola", 
                    "Queijo coalho", 
                    "Orégano"
                });
            case DA_CASA:
                return new DaCasa("Da Casa", 33.90, new String[]{
                    "Molho de tomate", 
                    "Queijo", 
                    "Presunto", 
                    "Calabresa", 
                    "Cebola", 
                    "Azeitona", 
                    "Orégano"
                });
            default:
                throw new IllegalArgumentException("Opção inválida!");
        }
    }
}
