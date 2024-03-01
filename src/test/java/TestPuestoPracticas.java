import com.recuperacion.recuperacionordinaria.datos.Puestos;
import com.recuperacion.recuperacionordinaria.excepciones.AlumnoInexistenteException;
import com.recuperacion.recuperacionordinaria.excepciones.EmpresaInexistenteException;
import com.recuperacion.recuperacionordinaria.excepciones.FechaInicioMayorException;
import com.recuperacion.recuperacionordinaria.excepciones.PuestoAsignadoException;
import com.recuperacion.recuperacionordinaria.modulos.PuestoPracticas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class TestPuestoPracticas {

    PuestoPracticas puesto;

    @BeforeEach
    void setUp(){
        puesto = new PuestoPracticas(0, null, null, null, null);
    }

    @Test
    void testIdPuestoRepetido(){
        puesto.asignarPuestoPracticas(Puestos.P1);
        Executable executable = () -> puesto.asignarPuestoPracticas(new PuestoPracticas(Puestos.P1.getId(),Puestos.P1.getAlumno(), Puestos.P2.getEmpresa(), Puestos.P1.getFechaInicio(), Puestos.P1.getFechaFin()));
        assertThrows(PuestoAsignadoException.class, executable);
    }

    @Test
    void testAlumnoVacio(){
        Executable executable = () -> puesto.asignarPuestoPracticas(new PuestoPracticas(Puestos.P1.getId(), null, Puestos.P1.getEmpresa(), Puestos.P1.getFechaInicio(), Puestos.P1.getFechaFin()));
        assertThrows(AlumnoInexistenteException.class, executable);
    }

    @Test
    void testEmpresaVacia(){
        Executable executable = () -> puesto.asignarPuestoPracticas(new PuestoPracticas(Puestos.P1.getId(), Puestos.P1.getAlumno(), null, Puestos.P1.getFechaInicio(), Puestos.P1.getFechaFin()));
        assertThrows(EmpresaInexistenteException.class, executable);
    }

    @Test
    void testFechaInicioMayorFinal(){
        Executable executable = () -> puesto.asignarPuestoPracticas(Puestos.P1);
        assertDoesNotThrow(executable);
        executable = () -> puesto.asignarPuestoPracticas(Puestos.P2);
        assertThrows(FechaInicioMayorException.class, executable);
    }


}
