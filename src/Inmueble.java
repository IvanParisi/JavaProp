import java.util.ArrayList;
import java.util.Iterator;

public class Inmueble 
{
	private Domicilio domicilio;
	private Double superficieM2;
	private int cantidadDeHambientes;
	private Double precioDolares;
	private Boolean reservado = false;
	
	private ArrayList<Notificable> interesados = new ArrayList<Notificable>();
	
	
	public Inmueble(Double superficieM2, int cantidadDeHambientes, Double precioDolares,
			String calle, String altura, String provincia, String localidad, String departamento) 
	{
		super();
		domicilio = new Domicilio (calle,altura,provincia,localidad,departamento);
		superficieM2 = superficieM2;
		cantidadDeHambientes = cantidadDeHambientes;
		precioDolares = precioDolares;
	}
	
	public void setPrecio(Double p) 
	{
		this.precioDolares = p;
		notificar("Se cambio el precio");
		
	}
	
	public void agregarInteresado(Cliente x) 
	{
		interesados.add(x);
	}
	
	public void agregarInteresado(Inmobiliaria x) 
	{
		interesados.add(x);
	}
	

	
	private void notificar(String mensaje)
	{
		for(Notificable x : interesados)
		{
			x.Notificar(mensaje);
			
		}
	}
}
