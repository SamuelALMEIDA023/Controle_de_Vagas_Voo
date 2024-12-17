package aplication;

import util.Voo;

public class Program {

	public static void main(String[] args) {
		
		Voo voo1 = new Voo(1223, "20-12-2024");
		Voo voo2 = new Voo(1348, "21-12-2024");
		
		voo1.verificar(38);
		voo1.verificar(39);
		
		voo1.ocuparCadeira(38);
		voo1.verificar(38);
		voo1.proximoLivre();

	}

}
