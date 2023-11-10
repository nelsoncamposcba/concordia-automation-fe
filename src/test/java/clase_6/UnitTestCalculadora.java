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

        Assert.assertEquals(resultadoActual, resultadoEsperado, "La suma no tiene el resultado correcto");
    }

    @Test
    public void testSumaIncorrecta(){
        Calculadora calculadora = new Calculadora();

        int a = 10;
        int b = 8;
        int resultadoActual = calculadora.suma(a, b);
        int resultadoEsperado = 8965;

        Assert.assertNotEquals(resultadoActual, resultadoEsperado, "La suma tiene el resultado correcto");
    }

    @Test
    public void testSumaMayor(){
        Calculadora calculadora = new Calculadora();

        int a = 10;
        int b = 8;
        int resultadoActual = calculadora.suma(a, b);
        int resultadoEsperado = 10;

        Assert.assertTrue(resultadoActual >= resultadoEsperado, "El resultado actual es menor al esperado");
    }
}
