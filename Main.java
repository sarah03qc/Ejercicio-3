package relatedclasses;

public class Main {

	public static void main(String[] args) {
		//la main en donde se vera como llamando a una (establo), ocurren procedimientos de la otra (caballo)
		Establo miestablo = new Establo();
		
		miestablo.addhorse("blanco", 88);
		
		miestablo.addhorse("cafe", 85);
	}

}
