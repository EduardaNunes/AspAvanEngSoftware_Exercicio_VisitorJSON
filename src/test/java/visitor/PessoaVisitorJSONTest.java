package visitor;

import org.example.visitor.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorJSONTest {

    @Test
    void deveExibirAlunoJSON() {
        Aluno aluno = new Aluno(1, "Ana", new Curso("Sistemas de Informação"));

        PessoaVisitorJSON visitor = new PessoaVisitorJSON();
        assertEquals("AlunoJSON: {matricula:1, nome:'Ana', curso:Sistemas de Informação}", visitor.exibir(aluno));
    }

    @Test
    void deveExibirProfessorJSON() {
        Professor professor = new Professor(1, "Maria", "Doutorado");

        PessoaVisitorJSON visitor = new PessoaVisitorJSON();
        assertEquals("ProfessorJSON: {matricula:1, nome:'Maria', titulacao:'Doutorado'}", visitor.exibir(professor));
    }

    @Test
    void deveExibirFuncionarioJSON() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        PessoaVisitorJSON visitor = new PessoaVisitorJSON();
        assertEquals("FuncionarioJSON: {codigo:1, nome:'Pedro', salario:5000.0}", visitor.exibir(funcionario));
    }

}

