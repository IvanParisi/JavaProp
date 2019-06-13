
public class Inmobiliaria implements Notificable
{
	private String nombre;
	private String email;
	private Double comisionPorVenta;
	
	public Inmobiliaria(String nombre, String email, Double comisionPorVenta) 
	{
		nombre = nombre;
		email = email;
		comisionPorVenta = comisionPorVenta;
	}

	@Override
	public void Notificar(String mensaje) 
	{
		System.out.println("Enviando mail a" + nombre);
		
	}
	
	
}
