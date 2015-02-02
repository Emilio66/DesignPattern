package command;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * The broker between client and executor
 * @author zhaozy
 */
public class Controller {
	private Command[] onCommands;
	private Command[] offCommands;
	Deque<Command> history=new ArrayDeque<Command>();	//record the history of commands
	
	public Controller(int slot){
		if (slot <=0) {
			slot =1;
		}
		onCommands=new Command[slot];
		offCommands=new Command[slot];
		NoCommand emptyCommand=new NoCommand();
		for (int i = 0; i < slot; i++) {
			onCommands[i]=emptyCommand;
			offCommands[i]=emptyCommand;
		}
	}
	
	public void init(int pos,Command on,Command off){
		if (pos>=0 && on!=null && off!=null) {
			onCommands[pos]=on;
			offCommands[pos]=off;
		}	
	}
	
	/**
	 * get user's command, press which button and what status, then execute and record it
	 * @param pos
	 * @param on
	 */
	public void setCommand(int pos,boolean on){
		Command command= on ? onCommands[pos] : offCommands[pos];
		command.execute();
		history.push(command);	//record current commands in case of undoing
	}
	
	/**
	 * undo previous command which means to invoke the undo method of last Command
	 */
	public void undo(){
		if (history.isEmpty()) {
			System.out.println("Back the oldest version");
		}else {
			System.out.println("undo ...");
			Command command=history.pop();
			command.undo();
		}
	}
	
}
