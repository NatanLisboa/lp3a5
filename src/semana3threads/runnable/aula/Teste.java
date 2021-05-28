package semana3threads.runnable.aula;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 1000);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 2000);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);
		
	}

}
