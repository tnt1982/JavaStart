package ćwiczenia.KonstrukcjaSuper.Ćwiczenie1;

final class Apple extends Fruit {

    private static final String VARIETY = "jabłkowaty";

    public Apple(int weight, String type) {
        super(weight, type);
    }

    public String getVARIETY() {
        return VARIETY;
    }

    @Override
    public String getInfo() {
        return
        super.getInfo() + ", odmiana: " + VARIETY;
    }
}
