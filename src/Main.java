import dio.desafio.Curso;
import dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Java básico");
        curso1.setCargaHoraria(40);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Evoluindo com Java");
        mentoria1.setDescricao("Domine estruturas essenciais do java");
        mentoria1.setData(LocalDate.now());
        System.out.println(curso1);
        System.out.println(mentoria1);
    }
}