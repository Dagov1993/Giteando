package pe.com.consultorjava.ejemplo;

public class TestGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sentimientos con git y git hub");
		
		Persona persona=new Persona("llorar","penando");
		persona.setLlorando("lloriqueando");
		persona.setSufriendo("Pataleando");
		System.out.println(persona.getLlorando());
		System.out.println(persona.getSufriendo());
		
		System.out.println("Es solo una prueba , no se lo vayan a creer");
	}

}

class Persona{
	private String llorando;
	private String sufriendo;
	
	public Persona(String llorando, String sufriendo) {
		this.llorando=llorando;
		this.sufriendo=sufriendo;
	}

	public String getLlorando() {
		return llorando;
	}

	public void setLlorando(String llorando) {
		this.llorando = llorando;
	}

	public String getSufriendo() {
		return sufriendo;
	}

	public void setSufriendo(String sufriendo) {
		this.sufriendo = sufriendo;
	}
	
	
	
}
