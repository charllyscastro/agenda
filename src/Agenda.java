
import java.util.HashSet;
import java.util.Set;



public class Agenda {
	
	Set<Contato> listaContatos = new HashSet<>();
	
	public void adicionar(Contato contato) {
		listaContatos.add(contato);
	}
	
	public void removerContato(String p){
//		for (Contato contato : listaContatos) {
//			if(contato.getNome().equals(p)) {
//				listaContatos.remove(contato);
//			}
//		}
//		
		for(Contato x: listaContatos) {
			if(x.getNome().equals(p)) {
				listaContatos.remove(x);
			}
		}
	}
	
	
	
	
	public void listar() {
		for (Contato contato : listaContatos) {
			System.out.println(contato);
		}
	}
	
	public void atualizarContato(Contato contato) {
		for (Contato c : listaContatos) {
			if(c.getId() == contato.getId()) {
				c.setEmail(contato.getEmail());
				c.setNome(contato.getNome());
				c.setTelefone(contato.getTelefone());
			}
		}
	}
	
}
