package ubu.ii.dmsii.actividad01 ;

public class NotFreeInstanceException extends Exception{
	
	public NotFreeInstanceException(){
		super("No hay m�s instancias reutilizables disponibles. Reintentalo m�s tarde");
	}
}