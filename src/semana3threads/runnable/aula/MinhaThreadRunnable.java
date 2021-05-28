package semana3threads.runnable.aula;

// Cria o modelo de uma thread utilizando a interface Runnable
public class MinhaThreadRunnable implements Runnable {

	private String nome;
	private int tempo;

	public MinhaThreadRunnable(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;		
		Thread t = new Thread(this); // Esse construtor recebe um objeto que implementa a interface Runnable
		t.start();
	}

	@Override
	public void run() {
		try {
			
			for (int i=0; i<6; i++) {
				System.out.println(nome + " contador " + i);
				Thread.sleep(tempo);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(nome + " terminou a execução");
	}
}

