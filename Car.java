package Practice;

public abstract class Car {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	
	
	public void washcar() {
		System.out.println("세차");
	}
	public void run() {
		this.start();
		this.drive();
		this.stop();
		this.turnoff();
		this.washcar();
	}
}
