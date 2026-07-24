import java.awt.geom.AffineTransform;
import java.util.Random;

public class Match {

	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;

	Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		this.f1 = f1;
		this.f2 = f2;
		this.maxWeight = maxWeight;
		this.minWeight = minWeight;
	}

	void run() {
		if (isCheck()) {
			
			Fighter first,second;
			Random rand = new Random();
			if (rand.nextBoolean()) {
				first = f1;
				second = f2;
			}else {
				first = f2;
				second = f1;
			}
			
			while (this.f1.health > 0 && this.f2.health > 0) {
				System.out.println("====Yeni Round====");
				this.f2.health = this.f1.hit(this.f2);
				if (isWin()) {
					break;
				}
				this.f1.health = this.f2.hit(this.f2);
				if (isWin()) {
					break;
				}
				System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
				System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
			}
		} else {
			System.out.println("Sporcuların Sikletleri Uymuyor.");
		}
	}

	boolean isCheck() {
		return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
				&& (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
	}
	
	boolean isWin(){
		if (this.f1.health==0) {
			System.out.println(f2.name + " kazandı!");
			return true;
		}
		if (this.f2.health==0) {
			System.out.println(f1.name + " kazandı!");
			return true;
		}
		
		return false;
	}
}
