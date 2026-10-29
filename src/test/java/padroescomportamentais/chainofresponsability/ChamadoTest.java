package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamadoTest {

    AtendenteGerente gerente;
    AtendenteEspecialista especialista;
    AtendenteNivel2 nivel2;
    AtendenteNivel1 nivel1;

    @BeforeEach
    void setUp() {
        gerente = new AtendenteGerente(null);
        especialista = new AtendenteEspecialista(gerente);
        nivel2 = new AtendenteNivel2(especialista);
        nivel1 = new AtendenteNivel1(nivel2);
    }

    @Test
    void deveRetornarNivel1ParaResetSenha() {
        assertEquals("Nível 1", nivel1.resolverChamado(new Chamado(TipoChamadoResetSenha.getTipoChamadoResetSenha())));
    }

    @Test
    void deveRetornarNivel2ParaConfiguracaoVPN() {
        assertEquals("Nível 2", nivel1.resolverChamado(new Chamado(TipoChamadoConfiguracaoVPN.getTipoChamadoConfiguracaoVPN())));
    }

    @Test
    void deveRetornarEspecialistaParaFalhaServidor() {
        assertEquals("Especialista", nivel1.resolverChamado(new Chamado(TipoChamadoFalhaServidor.getTipoChamadoFalhaServidor())));
    }

    @Test
    void deveRetornarGerenteParaVazamentoDados() {
        assertEquals("Gerente", nivel1.resolverChamado(new Chamado(TipoChamadoVazamentoDados.getTipoChamadoVazamentoDados())));
    }

    @Test
    void deveRetornarSemAtendimentoParaHardwareDanificado() {
        assertEquals("Sem atendimento", nivel1.resolverChamado(new Chamado(TipoChamadoHardwareDanificado.getTipoChamadoHardwareDanificado())));
    }

}