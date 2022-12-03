public class TestaEquipamento {
    public static void main(String[] args) {

        Equipamento objeto = new Equipamento();
        objeto.setEquipamento("Teclado", 10);

        Computador comp = new Computador();
        comp.setEquipamento("Computador", 5);
        comp.setInfo(4, 2);

        String nomeObj = objeto.getNome();
        int quantidadeObj = objeto.getQuantidade();

        String nomeComp = comp.getNome();
        int quantidadeComp = comp.getQuantidade();
        int[] compInfo = comp.getInfo();

        System.out.println("Objeto: " + nomeObj + " || quantidade: " + quantidadeObj);
        System.out.println("Computador: " + nomeComp + " || quantidade: " + quantidadeComp);
        System.out.println("Computador Info: Ram: " + compInfo[1] + " || armazenamento: " + compInfo[0]);

    }
}
