public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Aluno larissa = new Aluno("Larissa", "488.013.528.32", 2311035, "02/01/2024", "Feminino");
        
        larissa.setNome("Lariça");

        System.out.println(larissa.getNome());

        Aluno a = new Aluno();
        a.setNome("Francisco");
        a.setRA(2311035);
        
        System.out.println(larissa.getNome());
        System.out.println(larissa.getRA());

    }
}

