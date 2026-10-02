
import java.util.Scanner;

public class ejemplo_java {
	
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int t=0; //Almacenamos el tiempo en segundos
		int minutos=0, segundos=0, horas=0, dias=0;
		
	
	//ENTRADA
	System.out.println("Introduce un tiempo en segundos: ");
	t=sc.nextInt();
	
	//Algoritmo de conversión
	//t entre /  ???  -->> minutos
	//t queda %   ???  -->> segundos
	/*horas = t / 3600;
	minutos = t / 60;
	segundos = t % 60;*/
	
	while (t>=60) {
		//Incremento un minuto
		//Quito 60 segundos a t
		minutos++;
		t-=60;
	}
	segundos = t; 
	
	//Mientras minutos sea mayor o igual que 60 haz
	while(minutos>=60) {
		//Incremento una hora
		//Quito 60 minutos a los minutos
		horas++;
		minutos-=60;
	}
	
	while(horas>=24) {
		//Incremento un dia
		//Quito 24 horas a las horas
		dias++;
		horas-=24;
	}
	
	//SALIDA
	System.out.println("Ese tiempo convertido da: ");
	System.out.println("Días--> "+dias);
	System.out.println("Horas--> "+horas);
	System.out.println("Minutos--> "+minutos);
	System.out.println("Segundos --> "+segundos);
	
	sc.close();
}
}
