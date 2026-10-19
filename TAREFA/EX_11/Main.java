package EX_11;

public class Main {
    public static void main(String[] args) {
        Categoria eletronicos = new Categoria("C01", "Eletrônicos");
        Categoria celulares = eletronicos.criarSubcategoria("C02", "Celulares");
        Categoria smartphones = celulares.criarSubcategoria("C03", "Smartphones");
        Categoria informatica = eletronicos.criarSubcategoria("C04", "Informática");
        Categoria livros = new Categoria("C05", "Livros");

        Produto p1 = new Produto("P001", "Smartphone X", 1999.90, smartphones);
        Produto p2 = new Produto("P002", "Notebook Y", 3499.00, informatica);
        Produto p3 = new Produto("P003", "Romance Z", 39.90, livros);

        System.out.println(p1.exibirResumo());
        System.out.println(p2.exibirResumo());
        System.out.println(p3.exibirResumo());

        System.out.println("Eletrônicos é raiz? " + eletronicos.ehRaiz());
        System.out.println("Celulares é raiz? " + celulares.ehRaiz());
        System.out.println("Subcategorias de Eletrônicos: " + eletronicos.getSubcategorias().size());
        System.out.println("Pai de Smartphones: " + smartphones.getCategoriaPai().getNome());

        try {
            new Produto("P004", "Sem categoria", 10.00, null);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}