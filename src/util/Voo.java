package util;

public class Voo {
	
	private final Integer[] cadeirasVoo = new Integer[100];
	
	private Integer numVoo;
	private String data;
	
	public Voo(Integer numVoo, String data) {
		this.numVoo = numVoo;
		this.data = data;
	}

	public Integer getNumVoo() {
		return numVoo;
	}

	public void setNumVoo(Integer numVoo) {
		this.numVoo = numVoo;
	}

	public Integer[] getCadeirasVoo() {
		return cadeirasVoo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public int proximoLivre() {
		for(int i = 0; i < cadeirasVoo.length; i++) {
			if(cadeirasVoo[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	public void verificar(int cadeiraEscolhida) {
		if(cadeirasVoo[cadeiraEscolhida] != null) {
			System.out.println("Cadeira cupada");
		} else {
			System.out.println("Cadeira livre.");
		}
	}
	
	public boolean ocuparCadeira(int cadeiraEscolhida) {
		if(cadeiraEscolhida <= 0 || cadeiraEscolhida > cadeirasVoo.length) {
			System.out.println("Operação inválida");
			return false;
		}
			
	    if(cadeirasVoo[cadeiraEscolhida] != null) {
			return false;
	    } else {
		   cadeirasVoo[cadeiraEscolhida] = cadeiraEscolhida;
		   System.out.println("Operação bem sucedida");
		   return true;
	    }
	}
	
	public int vagas() {
		int count = 0;
		
		for(int i = 0; i < cadeirasVoo.length; i++) {
			if(cadeirasVoo[i] == null) {
				count += 1;
			}
		}
		
		System.out.println("Cadeiras livres: "+ count);
		return count;
	}
	
}
