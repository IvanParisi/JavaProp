
public class Cliente implements Notificable
{
	private String apellido;
	private String nombre;
	private String telefono;
	private String email;
	
	public Cliente(String apellido, String nombre, String telefono, String email) 
	{
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}


	public void Notificar(String mensaje) 
	{
		System.out.println("Enviando SMS a " + this.nombre + " " + this.apellido);
	}


	@Override
	public String toString() 
	{
		return "Cliente [apellido = " + apellido + ", nombre = " + nombre + "]";
	}
	
	

	
	
}
