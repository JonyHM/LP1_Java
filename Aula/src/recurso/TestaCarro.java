package recurso;
import javax.swing.JOptionPane;
public class TestaCarro {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Carro meuCarro = new Carro("VW","Fox");
		//meuCarro.cor = "Verde"; //Por que n�o funciona assim?
		meuCarro.setCor("verde");
		meuCarro.setPlaca("DSI1234");
		//System.out.println(meuCarro.placa());//Por que n�o funciona assim?
		System.out.println("Placa do Fox "+ meuCarro.getPlaca());
		
		Carro[] novoCarro=new Carro [5];
		novoCarro[0]= new Carro ("VW","Golf");
		novoCarro[0].setCor("prata");
		novoCarro[0].setPlaca(JOptionPane.showInputDialog("A placa de seu carro"));
		System.out.println("Placa do Golf � "+novoCarro[0].getPlaca());
		for (int i=1;i<5;i++)
		{
			novoCarro[i]= new Carro ("VW","Golf");
			novoCarro[i].setCor(JOptionPane.showInputDialog("Digite a cor deste carro "+i ));
		}
		
		for (int i=0;i<5;i++)
		{
			//System.out.println("Placa do Golf � "+novoCarro[i].getCor()); //Por que ainda n�o funciona?
		}
		
	}

}
