import com.recuperacion.recuperacionordinaria.datos.Alumnos;
import com.recuperacion.recuperacionordinaria.excepciones.AlumnoExistenteException;
import com.recuperacion.recuperacionordinaria.modulos.Alumno;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;


import static org.junit.jupiter.api.Assertions.*;

public class TestAlumno {

    Alumno alumno;

    @BeforeEach
    void setUp(){
        alumno = new Alumno("");
    }

    @ParameterizedTest
    @CsvSource({"DNI1"})
    void testDniRepetido(String dni){
        alumno.altaAlumno(Alumnos.A1);
        Executable executable = () -> alumno.altaAlumno(new Alumno(dni));
        assertThrows(AlumnoExistenteException.class, executable);
    }

}
