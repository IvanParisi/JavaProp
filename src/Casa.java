
public class Casa extends Inmueble
{
	private Boolean pileta;
	private Boolean garage;
	private Boolean jardin;
	
	public Casa(Double superficieM2, int cantidadDeHambientes, Double precioDolares,String calle,
			String altura, String provincia, String localidad, String departamento,Boolean Pileta,Boolean Garage,Boolean Jardin) 
	{
		super(superficieM2, cantidadDeHambientes, precioDolares, calle, altura, provincia, localidad, departamento);
		
		this.pileta = Pileta;
		this.garage = Garage;
		this.jardin = Jardin;
	}
	
	
}
