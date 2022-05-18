package services;

import java.util.ArrayList;
import java.util.List;

import exemplo.Lote;
import exemplo.Produto;
import repositories.LoteRepository;
import repositories.ProdutoRepository;

public class ProdutoService {
	
	LoteRepository loteRep;
	ProdutoRepository prodRep;
	
	public ProdutoService(LoteRepository loteRep, ProdutoRepository prodRep) {
		this.loteRep = loteRep;
		this.prodRep = prodRep;
	}
	
	public List<Produto> ListaProdsLoteByName(String nome){
		List<Lote> lotes = this.loteRep.getAll();
		List<Produto> prods = this.prodRep.getAll();
		
		return prods;
	}
	
	private List<Produto> getProdsWithLote(){
		List<Produto> prods = new ArrayList<Produto>();
		for(Lote lote : this.loteRep.getAll()) {
			prods.add(lote.getProduto());
		}
		return prods;
	}
}
