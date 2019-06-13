
public class Cliente implements Notificable
{
	private String apellido;
	private String nombre;
	private String telefono;
	private String email;
	
	public Cliente(String apellido, String nombre, String telefono, String email) 
	{
		apellido = apellido;
		nombre = nombre;
		telefono = telefono;
		email = email;
	}


	public void Notificar(String mensaje) 
	{
		System.out.println("Enviando SMS a " + nombre + apellido);
	}
	
	

	
	
}
