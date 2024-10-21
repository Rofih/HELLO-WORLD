public class TorchLight{
	boolean on = false;
	String colour = "neutral";
	int brightness = 1;
	
	public TorchLight(){
	} 

	public void turnOn() { 
		on = true;
	}
	public void turnOff() {
		on = false;
	}
	public void setBrightness(int newBrightness){
		if(on && newBrightness > 1 && newBrightness <= 3){
			brightness = newBrightness;
		}
	}
	public void setColour(String newColour){
		colour = newColour;
	}
	public void brightnessUp(){
		if(on && bightness <= 3){
			brightness++;
		}
	}
	public void brightnessDown(){
		if(on && bightness > 1){
			brightness--;
		}
	}

}