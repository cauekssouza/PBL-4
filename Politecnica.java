// Classe Politecnica
public class Politecnica {
    private Professor professor;

    public Politecnica(Professor professor){
        this.professor = professor;
    }

    public Professor getProfessor(){
        return professor;
    }

    public String getNomeProfessor(){
        return this.professor.getNome();
    }
}