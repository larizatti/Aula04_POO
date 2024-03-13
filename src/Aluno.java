public class Aluno {
    private String nome;
    private String CPF;
    private int RA;
    private String data_nascimento;
    private String sexo;

public Aluno (String nome, String CPF, int RA, String data_nascimento, String sexo){
    this.nome = nome;
    this.CPF = CPF;
    this.RA = RA;
    this.data_nascimento = data_nascimento;
    this.sexo = sexo;
}
    public Aluno (){
    
    }
    public void setNome (String entrada) {
        this.nome = entrada;
    } 

    public void setRA (int entrada) {
        this.RA = entrada;
    }

    public String getNome (){
        return this.nome;
    }
    public int getRA () {
        return this.RA;


    }


    
}
