package padroescomportamentais.chainofresponsability;

public class TipoChamadoConfiguracaoVPN implements TipoChamado {

    private static TipoChamadoConfiguracaoVPN tipoChamadoConfiguracaoVPN = new TipoChamadoConfiguracaoVPN();

    private TipoChamadoConfiguracaoVPN() {};
    
    public static TipoChamadoConfiguracaoVPN getTipoChamadoConfiguracaoVPN() {
        return tipoChamadoConfiguracaoVPN;
    }

}