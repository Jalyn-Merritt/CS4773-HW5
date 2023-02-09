package elevatorFunctions;

public class Elevator {
	
	State currentState;
	State floorOne;
	State floorTwo;
	State floorThree;
	String doorStatus;
	
	public Elevator() {
		floorOne = new FloorOneState(this);
		floorTwo = new FloorTwoState(this);
		floorThree = new FloorThreeState(this);
		currentState = floorOne;
		doorStatus = "Open";
	}
	
	public void pushFloorButtons(String buttonPush) {
		int buttonSelection = validateButtonPush(buttonPush);
		
		switch (buttonSelection) {
			case 1:
				pushFloorOneButton();
				break;
			case 2:
				pushFloorTwoButton();
				break;
			case 3:
				pushFloorThreeButton();
				break;
		}
	}
	
	public int validateButtonPush(String buttonPush) {
		try {
			int buttonPushAsInt = Integer.parseInt(buttonPush);
			return buttonPushAsInt;
		}
		catch(NumberFormatException exception) {}
		
		return 0;
	}
	
	public void openDoors() {
		this.doorStatus = "Open";
		System.out.println("Doors are open");
	}
	
	public void closeDoors() {
		this.doorStatus = "Closed";
		System.out.println("Doors are closed");
	}
	
	public void pushFloorOneButton() {
		System.out.println("1 pressed");
		currentState.pushFloorOneButton();
	}
	
	public void pushFloorTwoButton() {
		System.out.println("2 pressed");
		currentState.pushFloorTwoButton();
	}
	
	public void pushFloorThreeButton() {
		System.out.println("3 pressed");
		currentState.pushFloorThreeButton();
	}
	
	public State getFloorOneState() {
		System.out.println("*ding* The elevator arrives at Floor 1");
		return floorOne;
	}
	
	public State getFloorTwoState() {
		System.out.println("*ding* The elevator arrives at Floor 2");
		return floorTwo;
	}
	
	public State getFloorThreeState() {
		System.out.println("*ding* The elevator arrives at Floor 3");
		return floorThree;
	}
	
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
}