package Animal;

public class Human extends Animal3{
	
	public Human(int leg, int head, int hand) { 
		

		super(leg,head,hand); 
	}
	
	@Override
	public void play() {
		System.out.println("인간은 낮에 놈");
		
	}@Override
	public void eat() {
		System.out.println("인간은 하루 세번 식사를 함");
		
	}@Override
	public void sleep() {
		
		
		
		System.out.println("인간은 밤에 잠");
		
	}

	
}
