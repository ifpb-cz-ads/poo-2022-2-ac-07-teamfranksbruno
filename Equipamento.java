public class Equipamento {

    private String nome = "";
    private int quantidade = 0;

    public void setEquipamento(String n, int q) {
        this.nome = n;
        this.quantidade = q;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
}
