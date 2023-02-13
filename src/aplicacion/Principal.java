package aplicacion;

import mates.Matematicas;

public class Principal
{
	public static void main(String[] args)
	{
		System.out.println("El número PI aproximadamente es: " + Matematicas.monteCarlo(Integer.parseInt(args[0])));
	}
}
