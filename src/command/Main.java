package command;

public class Main {
	public static void main(String[]args) {
	
		Controller menu=new Controller(2);
		Light light = new Light();
		LightOnCommand lightOnCommand=new LightOnCommand(light);
		LightOffCommand lightOffCommand=new LightOffCommand(light);
		Door door =new Door();
		DoorOpenCommand doorOpenCommand=new DoorOpenCommand(door);
		DoorCloseCommand doorCloseCommand =new DoorCloseCommand(door);
		
		menu.init(0, lightOnCommand, lightOffCommand);
		menu.init(1, doorOpenCommand, doorCloseCommand);
		
		menu.setCommand(0, true);
		menu.setCommand(1, true);
		menu.setCommand(1, false);
		menu.setCommand(0, false);
		menu.undo();
		menu.undo();
	}
}
