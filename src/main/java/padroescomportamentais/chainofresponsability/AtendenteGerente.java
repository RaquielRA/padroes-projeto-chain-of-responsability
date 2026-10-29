package padroescomportamentais.chainofresponsability;

public class AtendenteGerente extends Atendente {

    public AtendenteGerente(Atendente superior) {
        listaChamados.add(TipoChamadoVazamentoDados.getTipoChamadoVazamentoDados());
        setAtendenteSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Gerente";
    }

}