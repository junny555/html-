package Animal;

public class AnimalMain {

	public static void main(String[] args) {

		Animal3 human = new Human(2, 1, 2);
		System.out.println("인간의 다리는"+human.leg+"개");
		System.out.println("인간의 머리는"+human.head+"개");
		System.out.println("인간의 손은"+human.hand+"개");
	
		Animal3 Duck = new Duck(2, 1, 2);
		System.out.println("오리의 다리는"+Duck.leg+"개");
		System.out.println("오리의 머리는"+Duck.head+"개");
		System.out.println("오리의 날개는"+Duck.hand+"개");
		
		Duck.play();
		Duck.sleep();
		Duck.eat();
		
		human.play();
		human.sleep();
		human.eat();
		
	
		
		
		
	}
	
	
		
	
	
}	

