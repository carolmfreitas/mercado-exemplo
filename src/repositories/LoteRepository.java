package repositories;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exemplo.Lote;

public class LoteRepository {
	private Map<String,Lote> lotes;
	
	public LoteRepository() {
		this.lotes = new HashMap<String,Lote>();
	}
	
	public Collection<Lote> getAll(){
		return this.lotes.values();
	}
	
	public String addLote(Lote p) {
		this.lotes.put(p.getId(), p);
		return p.getId();
	}
	
	public void deletaLote(String id) {
		this.lotes.remove(id);
	}
	
	public void editaLote(Lote p) {
		this.lotes.replace(p.getId(), p);
	}
	
	public Lote getLote(String id) {
		return this.lotes.get(id);
	}
	
}
