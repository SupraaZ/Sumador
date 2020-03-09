import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestASumar {


@Test
public void testUnaCifra() {
    ASumar sumi = new ASumar("5");
    String resultado = sumi.mostrar();
    assertEquals("5 = 5",resultado );
    
}

@Test
public void testNumeroNegativo() {
	ASumar sumi = new ASumar("-5");
	String resultado = sumi.mostrar();
	assertEquals("negativo", resultado);
}


@Test
public void testNumeroMayor() {
	ASumar sumi = new ASumar("234");
	String resultado = sumi.mostrar();
	assertEquals("2 + 3 + 4 = 9", resultado);
}





}