package padroescomportamentais.chainofresponsability;

public class TipoChamadoFalhaServidor implements TipoChamado {

    private static TipoChamadoFalhaServidor tipoChamadoFalhaServidor = new TipoChamadoFalhaServidor();

    private TipoChamadoFalhaServidor() {};

    public static TipoChamadoFalhaServidor getTipoChamadoFalhaServidor() {
        return tipoChamadoFalhaServidor;
    }
}