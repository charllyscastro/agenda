

public class TesteAgenda {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		
		Contato c1 = new Contato(1,"charllys","987838817","charllyscastro@gmail.com");
		Contato c2 = new Contato(2,"benedito","987463546","benedito@gmail.com");
		Contato c3 = new Contato(3,"ermo","987234573","ermo@gmail.com");
		Contato c4 = new Contato(4,"silvano","986573546","silvano@gmail.com");


		agenda.adicionar(c1);
		agenda.adicionar(c2);
		agenda.adicionar(c3);
		agenda.adicionar(c4);

		agenda.listar();
		System.out.println("------------------------");
		agenda.removerContato("benedito");
		agenda.listar();

		//Collections.sort(list, o1);

	}

}
