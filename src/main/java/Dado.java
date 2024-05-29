public class Dado {
    private int cara;

    public Dado() {
    }

    public void lanzar() {
        cara = (int) (Math.random() * 6 + 1);
    }

    public int getCara() {
        return cara;
    }
}
