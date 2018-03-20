
public class NodoLst {

	    private String nombre;
	    private NodoLst siguiente;
	    
	    public void NodoLst(){
	        this.nombre = null;
	        this.siguiente = null;
	    }
	    
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public NodoLst getSiguiente() {
	        return siguiente;
	    }

	    public void setSiguiente(NodoLst siguiente) {
	        this.siguiente = siguiente;
	    }   
	
}
