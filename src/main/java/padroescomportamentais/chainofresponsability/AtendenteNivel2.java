package padroescomportamentais.chainofresponsability;

public class AtendenteNivel2 extends Atendente {
    
    public AtendenteNivel2(Atendente superior) {
        listaChamados.add(TipoChamadoConfiguracaoVPN.getTipoChamadoConfiguracaoVPN());
        setAtendenteSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Nível 2";
    }
}