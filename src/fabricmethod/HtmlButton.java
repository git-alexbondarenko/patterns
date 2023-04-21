package fabricmethod;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("web style button");

    }

    @Override
    public void onClick() {
        System.out.println("web onclick");
    }
}
