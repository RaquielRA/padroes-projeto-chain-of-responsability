package padroescomportamentais.chainofresponsability;

public class TipoChamadoResetSenha implements TipoChamado {

    private static TipoChamadoResetSenha tipoChamadoResetSenha = new TipoChamadoResetSenha();

    private TipoChamadoResetSenha() {};
    
    public static TipoChamadoResetSenha getTipoChamadoResetSenha() {
        return tipoChamadoResetSenha;
    }

}