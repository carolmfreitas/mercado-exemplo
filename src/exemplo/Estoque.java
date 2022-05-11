package exemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Estoque {
	
	private Map<String,Produto> catalogo;
	
	public Estoque() {
		this.catalogo = new HashMap<String,Produto>();
	}
	
	public void addProduto(Produto p) {
		catalogo.put(p.getId(), p);
	}
	
	public void deletaProduto(String id) {
		catalogo.remove(id);
	}
	
	public void editaProduto(Produto p) {
		catalogo.replace(p.getId(), p);
	}
	
	public Produto recuperaProduto(String id) {
		return catalogo.get(id);
	}
	
	public ArrayList<Produto> listaProdutos() {
		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		for(Produto produto: catalogo.values()) {
			lista.add(produto);			
		}
		
		return lista;
	}
	
}
