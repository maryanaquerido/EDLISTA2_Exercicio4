package view;
import javax.swing.JOptionPane;

import controller.ControllerFatorialDuplo;
public class PrincipalFatorialDuplo {
	public static void main (String [] args) {
		
		ControllerFatorialDuplo m = new ControllerFatorialDuplo();
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero natural, �mpar!"));
		
		while (num % 2 == 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog(" O n�mero precisa ser �MPAR! Digite novamente: "));
		}
		
		int resp = m.FatorialDuplo(num);
		System.out.println(num + "!! = " + resp);
	}

}
