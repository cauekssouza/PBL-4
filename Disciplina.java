import java.util.ArrayList;

public class Disciplina {
    private String nome; // nome
    private Professor professor; // Professor
    private ArrayList<Aluno> alunos; // Lista de Aluno
    private static final int MAX_ALUNOS = 10; // Capacidade no maximo são 10 alunos

    // Construtor da Disciplina
    public Disciplina(String nome, Professor professor){
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }
    /*Métodos Getters e Setters para adicionar Alunos */
    public void adicionarAluno(Aluno aluno) {
        if (alunos.size() < MAX_ALUNOS) {
            alunos.add(aluno);
            System.out.println("Aluno " + aluno.getNome() + " Cadastrado com Sucesso na disciplina de " + nome);
        } else {
            System.out.println("Limite máximo de alunos atingido para a disciplina " + nome);
        }
    }

    // Informações
    public void informacoes() {
        System.out.println("\n=======Info da Disciplina============");
        System.out.println("Disciplina: " + this.nome + "\nProfessor: " + this.professor.getNome());
        System.out.println("Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome());
        }
        System.out.println("=======================================\n\n");
    }
    // Verificação do  Professor
    public Professor getProfessor(){
        return professor;
    }
}

