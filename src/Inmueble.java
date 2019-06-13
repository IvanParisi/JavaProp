import java.util.ArrayList;
import java.util.Iterator;

public class Inmueble 
{
	private Domicilio domicilio;
	private Double superficieM2;
	private int cantidadDeHambientes;
	private Double precioDolares;
	private Boolean reservado = false;
	
	private ArrayList<Cliente> clientesInteresados = new ArrayList<Cliente>();
	private ArrayList<Inmobiliaria> inmobiliariasInteresadas = new ArrayList<Inmobiliaria>();
	
	
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
		
		
	}
	
	public void agregarInteresadoC(Cliente x) 
	{
		clientesInteresados.add(x);
	}
	
	public void agregarInteresadoI(Inmobiliaria x) 
	{
		inmobiliariasInteresadas.add(x);
	}
	

	
	private void Notificar(String mensaje)
	{
		
	}
}
