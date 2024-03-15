public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Marina", "123456798");
        Disciplina disciplina = new Disciplina("POO", professor);

    


        Aluno aluno1 = new Aluno("João", "001");
        Aluno aluno2 = new Aluno("Maria", "002");
        Aluno aluno3 = new Aluno("Pedro", "003");
        Aluno aluno4 = new Aluno("Matheus", "004");
        Aluno aluno5 = new Aluno("Marcos", "005");
        Aluno aluno6 = new Aluno("Daniel", "006");
        Aluno aluno7 = new Aluno("Mariana", "007");
        Aluno aluno8 = new Aluno("Cauê", "008");
        Aluno aluno9 = new Aluno("Lucas", "009");
        Aluno aluno10 = new Aluno("Gabriela", "0010");
        Aluno aluno11 = new Aluno("Fernanda", "0011");
        Aluno aluno12 = new Aluno("Rafael", "012");

        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);
        disciplina.adicionarAluno(aluno3);
        disciplina.adicionarAluno(aluno4);
        disciplina.adicionarAluno(aluno5);
        disciplina.adicionarAluno(aluno6);
        disciplina.adicionarAluno(aluno7);
        disciplina.adicionarAluno(aluno8);
        disciplina.adicionarAluno(aluno9);
        disciplina.adicionarAluno(aluno10);
        disciplina.adicionarAluno(aluno11); // Tentativa de adicionar o 11º aluno.
        disciplina.adicionarAluno(aluno12); // Tentativa de adicionar o 12° aluno.

        disciplina.informacoes(); // Método renomeado de "imprimirInfo" para "informacoes"
    }
}







    

