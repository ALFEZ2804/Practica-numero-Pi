package mates;

import java.util.concurrent.ThreadLocalRandom;

public class Matematicas
{
	public static double generarNumeroPi(int n)
	{
    	int sum = 0;
    	for (int i = 0; i < n; i++) 
    	{
        	// Generar dos números aleatorios entre -1 y 1.
        	double x = ThreadLocalRandom.current().nextDouble() * 2 - 1;
        	double y = ThreadLocalRandom.current().nextDouble() * 2 - 1;

        	// Aplicar teorema de Pitágoras.
        	double h = x * x + y * y;

        	// Verificar si el tiro cayó dentro del círculo.
       		if (h <= 1) 
       		{
            	sum++;
        	}
    	}
    	return 4 * ((double) sum / n);
	}
}