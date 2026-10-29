package padroescomportamentais.chainofresponsability;

public class AtendenteEspecialista extends Atendente {

    public AtendenteEspecialista(Atendente superior) {
        listaChamados.add(TipoChamadoFalhaServidor.getTipoChamadoFalhaServidor());
        setAtendenteSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Especialista";
    }

}