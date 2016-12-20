

public class Game{
	
	private int possession;
	private int shots;
	private int passAccuracy;

	public Game(int possession, int shots, int passAccuracy) {
		this.possession = possession;
		this.shots = shots;
		this.passAccuracy = passAccuracy;
	}


	public int getPossession(){
		return possession;
	}

	public int getShots(){
		return shots;
	}

	public int getPassAccuracy() {
		return passAccuracy;
	}

	public String toString() {
		return possession + " " + shots + " " + passAccuracy;
	}
	
}