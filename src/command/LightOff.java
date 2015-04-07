package command;

/**
 * @author stepenluu
 * @since Apr 5, 2015
 */
public class LightOff implements Command {

	private Light light;

	public LightOff(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.off();
	}

}
