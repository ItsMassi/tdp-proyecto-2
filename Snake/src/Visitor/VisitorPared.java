package Visitor;

import Logica.Alimento;
import Logica.Celda;
import Logica.Criatura;
import Logica.Pared;
import Logica.Parte;
import Logica.PowerUp;

public class VisitorPared implements Visitor {
	public void visit (Alimento alimento) {}
	public void visit (PowerUp powerUp) {}
	public void visit (Celda celda) {}
	public void visit (Pared pared) {}
	public void visit (Parte parte) {}
	public void visit (Criatura criatura) {}

}
