package padroescomportamentais.chainofresponsability;

public class AtendenteNivel1 extends Atendente {
    
    public AtendenteNivel1(Atendente superior) {
        listaChamados.add(TipoChamadoResetSenha.getTipoChamadoResetSenha());
        setAtendenteSuperior(superior);
    }
    
    public String getDescricaoCargo() {
        return "Nível 1";
    }

}