public class Fan{
	boolean on = false;
	int speed = 1;
	Boolean rotate = false;
	
	public Fan(){
	}
	public void turnOn() { 
		on = true;
	}
	public void turnOff() {
		on = false;
	}

	public void onRotation(){
		rotate = true;
	}
	public void offRotation(){
		rotate = false;
	}

	public void setSpeed(int newSpeed){
		if(on && newSpeed >= 1 && newSpeed <= 5){
			speed = newSpeed
		}
	}
	public void increaseSpeed(){
		if(on && speed < 5){
			speed++;
		}
	}
	public void decreaseSpeed(){
		if(on && speed > 0){
			speed--;
		}
	}
}