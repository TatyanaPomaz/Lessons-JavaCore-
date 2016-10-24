
class LightBulb {
	private boolean state;;
	
	public void on() {
		heatTheBulb();
		state = true;
	};
	
	public void off() {};

	private void heatTheBulb() {
		state = false;
	}
	
	public void switchBulb() {
		state = !state;
	}
	
	public boolean equalTo(LightBulb bulb){
		return state == bulb.state;
	}
	
	

}