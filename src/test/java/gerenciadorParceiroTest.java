
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class gerenciadorParceiroTest {

    @Test
    public void deveRetornarNomeEmpresa() {
        gerenciadorParceiro.getInstance().setNomeEmpresa("Chocolate com Pimenta");
        assertEquals ("Chocolate com Pimenta", gerenciadorParceiro.getInstance().getNomeEmpresa());

    }

    @Test
    public void deveRetornarCNPJEmpresa() {
        gerenciadorParceiro.getInstance().setcnpjEmpresa("XX.XXX.XXX/0001-XX");
        assertEquals ("XX.XXX.XXX/0001-XX", gerenciadorParceiro.getInstance().getcnpjEmpresa());
    }
}
