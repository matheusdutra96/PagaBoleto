import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestaFatura {

	@Test
	public void testaFatura1() {
		
		ArrayList<Boleto> listaBoletos = new ArrayList<Boleto>();
		Boleto boleto1 = new Boleto("001","01/03/2020",500.00);
		Boleto boleto2 = new Boleto("002","02/04/2020",400.00);
		Boleto boleto3 = new Boleto("003","19/06/2020",600.00);
		
		listaBoletos.add(boleto1);
		listaBoletos.add(boleto2);
		listaBoletos.add(boleto3);
		
		Fatura fatura = new Fatura("Fabiano Silva","20/06/2020",1500.00);
		
		assertTrue(fatura.pagaFatura(listaBoletos));
	}
	
	@Test
	public void testaFatura2() {
		
		ArrayList<Boleto> listaBoletos = new ArrayList<Boleto>();
		Boleto boleto1 = new Boleto("001", "02/02/2020",1000.00);
		Boleto boleto2 = new Boleto("002","10/04/2020",500.00);
		Boleto boleto3 = new Boleto("003","11/05/2020",200.00);
		
		listaBoletos.add(boleto1);
		listaBoletos.add(boleto2);
		listaBoletos.add(boleto3);
		
		Fatura fatura = new Fatura("Mariana Pereira","06/06/2020", 1500.00);
		
		assertTrue(fatura.pagaFatura(listaBoletos));
	}
	
	@Test
	public void testaFatura3() {
		
		ArrayList<Boleto> listaBoletos = new ArrayList<Boleto>();
		Boleto boleto1 = new Boleto("001","01/02/2020", 500.00);
		Boleto boleto2 = new Boleto("002","03/05/2020", 400.00);
		
		listaBoletos.add(boleto1);
		listaBoletos.add(boleto2);
		
		Fatura fatura = new Fatura("Pedro Goulart","28/05/2020", 2000.00);
		
		assertFalse(fatura.pagaFatura(listaBoletos));
	}
	
}
