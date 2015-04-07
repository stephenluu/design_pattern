package command;

/**
 * @author stepenluu
 * @since Apr 5, 2015
 */
public class RemoteControl {
	private Command command;

	public RemoteControl(Command command) {
		this.command = command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void onButtonWasPressed() {
		command.execute();
	}

}
