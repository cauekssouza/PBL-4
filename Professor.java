// Classe Professor
public class Professor {
    private String codRH;
    private String nome;

    public Professor(String nome, String codRH){
        this.nome = nome;
        this.codRH = codRH;
    }

    public String getCodRH(){
        return codRH;
    }

    public void setCodRh(String codRH){
        this.codRH = codRH;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
