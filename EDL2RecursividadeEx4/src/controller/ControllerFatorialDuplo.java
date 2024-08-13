package controller;

public class ControllerFatorialDuplo {
	public ControllerFatorialDuplo () {
		super ();
	}
	
	public int FatorialDuplo (int num) {
		if (num == 1) {
			return 1;
			
		}
		else {
			return num * FatorialDuplo(num - 2);
		}
	}

}
