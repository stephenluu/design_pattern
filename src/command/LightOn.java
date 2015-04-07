package command;

/**
 * @author stepenluu
 * @since Apr 5, 2015
 */
public class LightOn implements Command {

	private Light light;

	public LightOn(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.on();
	}

}
