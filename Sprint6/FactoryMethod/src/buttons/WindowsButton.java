package buttons;

public class WindowsButton implements Button{

	@Override
	public void render() {
		System.out.println("Test Button Windows");
        onClick();
		
	}

	@Override
	public void onClick() {
		System.out.println("Click! Button says - 'Hello World!'");
		
	}

}
