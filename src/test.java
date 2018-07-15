public class test {

    public static void main(String[] args) {


        MultiArray tabela = new MultiArray(5, 5);

        tabela.print();

        System.out.println("po kolejnym losowaniu mamy:");

        tabela.randomize();

        tabela.print();


        System.out.println("najmniejsza wartość w tabeli to " + tabela.findMin());
        System.out.println("najwieksza wartość w tabeli to " + tabela.findMax());


    }
}
