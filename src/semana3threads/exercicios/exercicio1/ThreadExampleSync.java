package semana3threads.exercicios.exercicio1;

public class ThreadExampleSync {

	public static void main(String[] args) {
		Runnable paralelo = new RunnableHelloWorld();
		// paralelo.run();
		Thread t1 = new Thread(paralelo);
		t1.start();
		System.out.println("Thread principal: " + Thread.currentThread().getName());
	}
}


