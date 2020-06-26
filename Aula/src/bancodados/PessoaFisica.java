package bancodados;

public class PessoaFisica {
	private double altura;
	private double massa;
	private String nome;
	private char sexo;
	
    public PessoaFisica(String n,char sexo)
    {
    	nome=n;
    	this.sexo=sexo;
    }
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public double getMassa() {
		return massa;
	}
	public void setMassa(float massa) {
		this.massa = massa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void escreverAfazeres() {
		System.out.println("eu, " + nome + ", andei alguns passos");	
	}
		
	public boolean sorrir() {
		return true;
	}
	
	public void comer(String oque)	{
		System.out.println(nome+ " comeu " + oque);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica n=new PessoaFisica("Jo�o",'M');
	   n.comer("arroz");
	   n.escreverAfazeres();
		}

}