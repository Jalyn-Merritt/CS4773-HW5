package elevatorFunctions;

public class FloorOneState implements State {
	
	Elevator elevator;
	
	public FloorOneState(Elevator elevator) {
		this.elevator = elevator;
	}

	@Override
	public void pushFloorOneButton() {
		if(elevator.doorStatus.equals("Open"))
			elevator.closeDoors();
		
		System.out.println("Nothing happens");
	}

	@Override
	public void pushFloorTwoButton() {
		if(elevator.doorStatus.equals("Open"))
			elevator.closeDoors();
		
		System.out.println("Going up...");
		elevator.setCurrentState(elevator.getFloorTwoState());
		elevator.openDoors();
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