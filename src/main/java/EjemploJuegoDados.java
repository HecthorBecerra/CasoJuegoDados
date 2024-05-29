public class EjemploJuegoDados {

    private Dado dado1;
    private Dado dado2;
    private short resultado;

    public EjemploJuegoDados() {
        dado1 = new Dado();
        dado2 = new Dado();
    }

    public void lanzarDados() {
        dado1.lanzar();
        dado2.lanzar();
        resultado = (short) (dado1.getCara() + dado2.getCara());
    }

    public void mostrarResultado() {
        System.out.println("Dado 1: " + dado1.getCara());
        System.out.println("Dado 2: " + dado2.getCara());
        System.out.println("Resultado: " + resultado);
    }

    public boolean esVictoria() {
        return resultado == 7;
    }

    public short getResultado() {
        return resultado;
    }

}
