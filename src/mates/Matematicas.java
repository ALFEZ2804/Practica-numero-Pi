package mates;

import java.util.concurrent.ThreadLocalRandom;

public class Matematicas
{
	// Este método lo que hace es de generar un número aleatorio entre el 1 y el -1 dentro del cuadrado hay un círculo inscrito,se aplica el teorema de pitágoras
	// y verifica si la coordenada aleatoria ha caído dentro o fuera del círculo, por último en base a esto calcula el número pi.
	public static double monteCarlo(int numeroCoordenadas)
	{
    	int sumatorio = 0;
    	for (int i = 0; i < numeroCoordenadas; i++) 
    	{
        	double coordenadaX = ThreadLocalRandom.current().nextDouble() * 2 - 1;
        	double coordenadaY = ThreadLocalRandom.current().nextDouble() * 2 - 1;

        	double hip = coordenadaX * coordenadaX + coordenadaY * coordenadaY;

        	if (hip <= 1) 
       		{
            	sumatorio++;
        	}
    	}
    	return 4 * ((double) sumatorio / numeroCoordenadas);
	}
}
