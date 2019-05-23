import java.util.*;
import java.util.stream.Collectors;

public class ListaEleitoral {

    private String partidoPolitico;
    private Set<Candidato> eleitos;
    private List<Candidato> porEleger;

    public ListaEleitoral(String partidoPolitico, Collection<Candidato> candidatos){
        this.partidoPolitico = partidoPolitico;
        this.eleitos = candidatos.stream().filter(Candidato::getEleito).collect(Collectors.toSet());
        this.porEleger = candidatos.stream().filter(x-> !(x.getEleito())).collect(Collectors.toList());
    }

    


}
