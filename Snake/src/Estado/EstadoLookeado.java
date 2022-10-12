package Estado;

import Logica.App;
import Logica.Criatura;
import Logica.EntidadGrafica;

public class EstadoLookeado extends Estado {
	protected static final EntidadGrafica look = new EntidadGrafica(App.class.getResource("LookLookeado.png"));
	protected static final float velocidad = 1;
	
	public EstadoLookeado (Criatura criatura) {
		criatura.setEstado(this);
		criatura.lookear();
	}
	
	public float getVelocidad() {return velocidad;}
	public EntidadGrafica getAspecto () {return look;}


}
