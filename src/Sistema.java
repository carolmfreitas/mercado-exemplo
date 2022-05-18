
import exemplo.Lote;
import exemplo.Produto;
import repositories.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Leite", "Parmalat", 10.5);
		Produto p2 = new Produto("Leite Integral", "vale", 6.5);
		Lote l1 = new Lote(p1, 10L);
		ProdutoRepository estoque = new ProdutoRepository();
		
		estoque.addProduto(p1);
		estoque.addProduto(p2);
		
		System.out.println(p1);
		System.out.println(l1);
	}
}

