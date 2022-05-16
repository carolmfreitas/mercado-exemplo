package exemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdutoRepository {
	
	private Map<String,Produto> catalogo;
	
	public ProdutoRepository() {
		this.catalogo = new HashMap<String,Produto>();
	}
	
	public List<Produto> getAll(){
		return (List<Produto>) this.catalogo.values();
	}
	
	public void addProduto(Produto p) {
		this.catalogo.put(p.getId(), p);
	}
	
	public void deletaProduto(String id) {
		this.catalogo.remove(id);
	}
	
	public void editaProduto(Produto p) {
		this.catalogo.replace(p.getId(), p);
	}
	
	public Produto recuperaProduto(String id) {
		return this.catalogo.get(id);
	}
	
	public ArrayList<Produto> listaProdutos() {
		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		for(Produto produto: catalogo.values()) {
			lista.add(produto);			
		}
		
		return lista;
	}
	
	public List<Produto> listarProdByName(String nome){
		List<Produto> prods = new ArrayList<Produto>();
		
		for(Produto p: getAll()) {
			if(p.getNome().toLowerCase().contains(nome.toLowerCase())) {
				prods.add(p);
			}
		}
		
		return(prods);
	}
	
}
