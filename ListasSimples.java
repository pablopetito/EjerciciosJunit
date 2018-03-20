public class ListasSimples {

	public static void main(String[] args) {

		Lista listado = new Lista();
		
		listado.agregarAlFinal("Martin");
		listado.agregarAlFinal("Agustina");
		listado.agregarAlFinal("Cristian");
		listado.agregarAlFinal("Andres");
		listado.agregarAlFinal("Cristian");
		listado.agregarAlFinal("Pablo");
		
		System.out.println(listado.getTamanio());
		
		listado.listar();
		
	}
}

	
