
public class Domicilio 
{
	private String calle;
	private String altura;
	private String provincia;
	private String localidad;
	private String departamento;
	
	public Domicilio(String calle, String altura, String provincia, String localidad, String departamento) 
	{
		super();
		calle = calle;
		altura = altura;
		provincia = provincia;
		localidad = localidad;
		departamento = departamento;
	}
	public Domicilio(String calle, String altura, String provincia, String localidad) 
	{
		this(calle,altura,provincia,localidad,null);
	}
	
	
}
