

package br.com.infox.testes;


import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;
import br.com.infox.dao.ModuloConexao;

public class ModuloConexaoTest {

    @Test
    public void conexaoNaoDeveSerNula() throws Exception {
        System.out.println("Testando conexão com o banco...");

        Connection conexao = ModuloConexao.conector();

        assertNotNull("A conexão não pode ser nula", conexao);

        if (conexao != null) {
            conexao.close();
        }
    }
}

