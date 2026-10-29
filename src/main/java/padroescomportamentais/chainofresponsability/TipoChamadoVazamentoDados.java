package padroescomportamentais.chainofresponsability;

public class TipoChamadoVazamentoDados implements TipoChamado {

    private static TipoChamadoVazamentoDados tipoChamadoVazamentoDados = new TipoChamadoVazamentoDados();

    private TipoChamadoVazamentoDados() {};

    public static TipoChamadoVazamentoDados getTipoChamadoVazamentoDados() {
        return tipoChamadoVazamentoDados;
    }
}