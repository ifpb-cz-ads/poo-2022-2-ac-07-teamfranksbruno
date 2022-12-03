public class Computador extends Equipamento {
    private int armazenamento = 0;
    private int ram = 0;

    public int[] getInfo() {
        int[] result = {this.armazenamento, this.ram};
        return result;
    }

    public void setInfo(int a, int r) {
        this.armazenamento = a;
        this.ram = r;
    }
}