package thread;

public class Numprint implements Runnable {

	@Override
	public void run() {
		for(int i= 1;i<16;i++) {
			System.out.println(i+" ");
		}

	}

}
