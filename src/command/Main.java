package command;

/**
 * @author stepenluu
 * @since Apr 5, 2015
 */
public class Main {

	public static void main(String[] args) {

		Light light = new Light();
		Command lightOn = new LightOn(light);
		RemoteControl remoteControl = new RemoteControl(lightOn);

		remoteControl.onButtonWasPressed();

		Command lightOff = new LightOff(light);
		remoteControl.setCommand(lightOff);
		remoteControl.onButtonWasPressed();
	}
}
