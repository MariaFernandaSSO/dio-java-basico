import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("desc curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("desc curso js");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria js");
        mentoria2.setDescricao("descricao mentoria js");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descricao Bootcamp Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("----/----");
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());

        System.out.println("-------------------------");

        Dev devJose = new Dev();
        devJose.setNome("Jose");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos Jose: " + devJose.getConteudosInscritos());
        devJose.progredir();
        devJose.progredir();
        devJose.progredir();
        System.out.println("----/----");
        System.out.println("\nConteúdos inscritos Jose: " + devJose.getConteudosInscritos());
        System.out.println("\nConteúdos concluidos Jose: " + devJose.getConteudosConcluidos());
        System.out.println("XP: " + devJose.calcularTotalXp());
    }
}
