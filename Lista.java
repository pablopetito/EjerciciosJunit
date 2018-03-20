
public class Lista {

	private NodoLst inicio;
	private int tamanio;

	public Lista() {
		inicio = null;
		tamanio = 0;
	}

	public boolean esVacia() {
		return inicio == null;
	}


	public int getTamanio() {
		return tamanio;
	}

	public void agregarAlFinal(String nom) {

		NodoLst nuevo = new NodoLst();

		nuevo.setNombre(nom);
		
		if (esVacia()) {
			inicio = nuevo;
			
		} else {
			
			NodoLst aux = inicio;
			
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			
			aux.setSiguiente(nuevo);
		}
		
		tamanio++;
	}
	
	public void listar(){
        
        if (!esVacia()) {
        
            NodoLst aux = inicio;
        
            int i = 0;

            while(aux != null){

            	System.out.println(i + ". " + aux.getNombre());

                aux = aux.getSiguiente();

                i++;
            }
        }
    }
}
