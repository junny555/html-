

package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class CarTest {
	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList();
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		Iterator var3 = carList.iterator();

		while (var3.hasNext()) {
			Car car = (Car) var3.next();
			car.run();
			System.out.println("======================");
		}

	}
}
