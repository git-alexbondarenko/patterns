package fabricmethod;

// fabric method
abstract class Dialog {
    public void render() {
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }

    abstract Button createButton();
}
