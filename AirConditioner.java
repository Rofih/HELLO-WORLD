public class AirConditioner{
	boolean on = false;
	int level = 23;

	public AirConditioner(){
	} 

	public void turnOn() { 
		on = true;
	}
	public void turnOff() {
		on = false;
	}
	public void setLevel(int newLevel) { 
		if (on && newLevel >= 15 && newLevel <= 23){
			level = newLevel;
		}
	}
	public void levelUp() { 
		if (on && level < 23){
			channel--;
		}
	}
	public void levelDown() { 
		if (on && level  > 15){
			channel++;
		}
	}

 
}