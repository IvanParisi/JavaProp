
public class Departamento extends Inmueble
{
	private Boolean cochera;
	private Boolean baulera;
	
	public Departamento(Double superficieM2, int cantidadDeHambientes, Double precioDolares,
			String calle, String altura, String provincia, String localidad, String departamento,Boolean Cochera,Boolean Baulera) 
	{
		super(superficieM2, cantidadDeHambientes, precioDolares, calle, altura, provincia, localidad, departamento);
		this.cochera = Cochera;
		this.baulera = Baulera;
	}
	
}
