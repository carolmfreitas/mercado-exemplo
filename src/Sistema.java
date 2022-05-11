import exemplo.Estoque;
import exemplo.Lote;
import exemplo.Produto;

public class Sistema {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Leite", "Parmalat");
		Lote lote = new Lote(produto, 10L);
		Estoque estoque = new Estoque();
		
		System.out.println(produto);
		System.out.println(lote);
	}
}

