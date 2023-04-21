package fabricmethod;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("windows style button");
    }

    @Override
    public void onClick() {
        System.out.println("windows onclick");
    }
}
