

public class Principal
{

	public static void main(String[] args) 
	{
		//Depto M2,Hambientes,Precio,Calle,Altura,Provincia,Localidad,Departamento,Cochera,Baulera.
		//Casa M2,Hambientes,Precio,Calle,Altura,Provincia,Localidad,Pileta,Garage,Jardin.
		
		Inmueble d1 = new Departamento(100.0,3,450.879,"Calle Falsa","123","C.A.B.A","Boedo","3",false,false);
		
		Cliente a = new Cliente("Parisi","Ivan","123","123@1");
		Inmobiliaria b = new Inmobiliaria("Parisi","123@1",12.5);
		
		d1.agregarInteresado(a);
		d1.agregarInteresado(b);
		d1.setPrecio(988.54);
		
	}			

}
