package sistema_de_agencia;

import javax.swing.SwingUtilities;
import sistema_de_agencia.gui.TelaPrincipal;





public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new TelaPrincipal();
			}
		});
		
		
	}

}