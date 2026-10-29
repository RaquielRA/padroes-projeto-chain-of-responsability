package padroescomportamentais.chainofresponsability;

public class TipoChamadoHardwareDanificado implements TipoChamado {

    private static TipoChamadoHardwareDanificado tipoChamadoHardwareDanificado = new TipoChamadoHardwareDanificado();

    private TipoChamadoHardwareDanificado() {};
    
    public static TipoChamadoHardwareDanificado getTipoChamadoHardwareDanificado() {
        return tipoChamadoHardwareDanificado;
    }
}