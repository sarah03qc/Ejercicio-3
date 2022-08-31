package relatedclasses;

public class Establo {
	
	public void addhorse(String color, int velocidad) {
		
		//para anadir un caballo
		Caballo newhorse = new Caballo();
		
		//le ponemos los atributos importantes
		newhorse.set_color(color);
		newhorse.set_speed(velocidad);
	}
}
