package clase_6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTestCalculadora {

    @Test
    public void testSumaCorrecta(){
        Calculadora calculadora = new Calculadora();

        int a = 10;
        int b = 8;
        int resultadoActual = calculadora.suma(a, b);
        int resultadoEsperado = 18;

        Assert.assertEquals(resultadoActual, resultadoEsperado);
    }

}
