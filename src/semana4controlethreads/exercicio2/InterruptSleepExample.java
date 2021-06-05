package semana4controlethreads.exercicio2;

public class InterruptSleepExample {

	public static void main(String[] args) {
		
		Runnable objeto = new ImplementacaoDeRunnable("natan", 200);
		Thread t1 = new Thread(objeto);
		t1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ignored) {
			
		}
		
		t1.interrupt();
		
		System.out.println("\nThread " + Thread.currentThread().getName() + " is DONEEEEEEE!");
	}

}
