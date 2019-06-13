
public class Inmobiliaria implements Notificable
{
	private String nombre;
	private String email;
	private Double comisionPorVenta;
	
	public Inmobiliaria(String nombre, String email, Double comisionPorVenta) 
	{
		this.nombre = nombre;
		this.email = email;
		this.comisionPorVenta = comisionPorVenta;
	}

	@Override
	public void Notificar(String mensaje) 
	{
		System.out.println("Enviando mail a " + this.nombre);
		
	}
	
	
}
