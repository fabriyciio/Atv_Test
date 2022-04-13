
import org.junit.Assert;
import org.junit.Test;


public class CalculadoraTest{


    Calculadora cal =new Calculadora();

     @Test

     public void TestaSoma() {

    
        Assert.assertEquals(11,cal.Soma(5, 6));

     }

     @Test

     public void TestaSubtracao() {

    
        Assert.assertEquals(-1,cal.Subtração(5, 6));

     }

     @Test

     public void TestaDivisao() {

    
        Assert.assertEquals(5,cal.Divesao(10, 2));

     }

     @Test

     public void TestMutiplicacao() {

    
        Assert.assertEquals(20,cal.Mutiplicação(10, 2));

     }

  

  }