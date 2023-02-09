package elevatorFunctions;

public class FloorTwoState implements State {
	
	Elevator elevator;
	
	public FloorTwoState(Elevator elevator) {
		this.elevator = elevator;
	}

	@Override
	public void pushFloorOneButton() {
		if(elevator.doorStatus.equals("Open"))
			elevator.closeDoors();
		
		System.out.println("Going down...");
		elevator.setCurrentState(elevator.getFloorOneState());
		elevator.openDoors();
	}

	@Override
	public void pushFloorTwoButton() {
		if(elevator.doorStatus.equals("Open"))
			elevator.closeDoors();
		
		System.out.println("Nothing happens");
	}

	@Override
	public void pushFloorThreeButton() {
		if(elevator.doorStatus.equals("Open"))
			elevator.closeDoors();
		
		System.out.println("Going up...");
		elevator.setCurrentState(elevator.getFloorThreeState());
		elevator.openDoors();
	}
}