package semana4controlethreads.exercicio3;

public class ImplementacaoDeRunnable implements Runnable {

	private String nome;
	private long delay;

	public ImplementacaoDeRunnable(String nome, long delay) {
		this.nome = nome;
		this.delay = delay;
	}

	@Override
	public void run() {
		try {
			int i = 1;
			while(true) {
				System.out.println(nome + " " + i++);
				Thread.sleep(delay);
			}
		} catch (InterruptedException e) {
			System.out.println("\n" + Thread.currentThread().getName() + " interrompida.");
			System.out.println("Conteudo do Flag interrompido: " + Thread.currentThread().isInterrupted());
		}
		System.out.println("Thread " + Thread.currentThread().getName() + " Finalizada (classe PrintWord)!");
	}
}