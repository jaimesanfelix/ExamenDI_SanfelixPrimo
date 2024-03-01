import com.recuperacion.recuperacionordinaria.datos.Empresas;
import com.recuperacion.recuperacionordinaria.excepciones.EmpresaExistenteException;
import com.recuperacion.recuperacionordinaria.modulos.Empresa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestEmpresa {

    Empresa empresa;

    @BeforeEach
    void setUp(){
        empresa = new Empresa(0, null, null);
    }


    @Test
    void testIdEmpresaRepetido(){
        empresa.altaEmpresa(Empresas.E1);
        Executable executable = () -> empresa.altaEmpresa(Empresas.E1);
        assertThrows(EmpresaExistenteException.class, executable);
    }

}
