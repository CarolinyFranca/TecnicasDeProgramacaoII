import java.util.Arrays;

public enum Opcoes {
    CALABRESA(1),
    PORTUGUESA(2),
    QUATRO_QUEIJOS(3),
    CANGACEIRA(4),
    DA_CASA(5);

    private Integer id;

    Opcoes(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public static Opcoes getOpcoes(Integer id){
        return Arrays.stream(Opcoes.values())
            .filter(tp -> tp.getId().equals(id))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Tipo Inválido. Id: "+id));
    }

}
