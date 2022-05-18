package repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import exemplo.Produto;

public class ProdutoRepository {
	
	private Map<String,Produto> produtos;
	
	public ProdutoRepository() {
		this.produtos = new HashMap<String,Produto>();
	}
	
	public Collection<Produto> getAll(){
		return this.produtos.values();
	}
	
	public String addProduto(Produto p) {
		this.produtos.put(p.getId(), p);
		return p.getId();
	}
	
	public void deletaProduto(String id) {
		this.produtos.remove(id);
	}
	
	public void editaProduto(Produto p) {
		this.produtos.replace(p.getId(), p);
	}
	
	public Produto getProduto(String id) {
		return this.produtos.get(id);
	}

}
