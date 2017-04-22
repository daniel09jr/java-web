package dao.teste;

import java.util.Optional;
import dao.LivroDao;

public class Pesquisa {
	
	public static void main(String[] args){
		
		String titulo = Optional.of(args).filter(p->p.length > 0).get()[0];
		
		LivroDao dao = new LivroDao();
		
		dao.consultar(titulo).forEach(p-> System.out.println("Desc: " + p.getTitulo() + " Preço: " + p.getPreco()));
	}
}