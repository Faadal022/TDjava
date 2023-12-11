 import java.awt.*;
public class Robot{
	String nom;
	private Point position;
	int vitesse;
	int niveau;

	public Robot(String MonRobot){
		nom = MonRobot;
		position = new Point(0,0);
		vitesse = 0;
	}
	public Robot(String MonRobot, int x, int y, int vitesse){
		nom = MonRobot;
		position = new Point(x,y);
		this.vitesse = vitesse;
	}
	public void allerALEst(){
  		position.translate(vitesse,0);
     }
     public void allerALOuest(){
		position.translate(-vitesse,0);

	}
	public void allerAuNord(){
		position.translate(0,vitesse);
    }
    public void allerAuSud(){
		position.translate(0,-vitesse);
	}
	public void accelerer(){
		if (vitesse < 10) 
		vitesse++;
	}
	public void decelerer(){ 
		vitesse--;

		if (vitesse == 0){
			stop();
		}
	}
	public void stop(){
		vitesse = 0; 
	}
	public Point getposition(){
		return position;
	}
	public void sepresenter(){
		System.out.println("nom"+nom+"position"+position);
	}
	    public void setNiveau(int n) {
        niveau = Math.min(100, Math.max(0, n));
    }

    // Méthode pour obtenir le niveau de combustible
    public int getNiveau() {
        return niveau;
    }

    // Méthode pour effectuer un mouvement aléatoire
    public void sePromener() {
        if (niveau > 0) {
            double random = Math.random();
            int direction = (int) (random * 4);

            switch (direction) {
                case 0:
                    allerALEst();
                    break;
                case 1:
                    allerALOuest();
                    break;
                case 2:
                    allerAuNord();
                    break;
                case 3:
                    allerAuSud();
                    break;
            }

            niveau--; 
        } else {
            System.out.println("Le robot est à court de combustible.");
        }
    }
}

       

