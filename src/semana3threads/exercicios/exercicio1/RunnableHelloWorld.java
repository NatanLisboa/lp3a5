package semana3threads.exercicios.exercicio1;

public class RunnableHelloWorld implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello world paralelo!");
		System.out.println("Eu sou o thread: " + Thread.currentThread().getName());
	}
}
