import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso cursoOne = new Curso();
       cursoOne.setTitulo("Curso Java");
       cursoOne.setDescricao("Descricao curso Java");
       cursoOne.setCargaHoraria(12);


        Curso cursoTwo = new Curso();
        cursoTwo.setTitulo("Curso Csharp");
        cursoTwo.setDescricao("Descricao curso Csharp");
        cursoTwo.setCargaHoraria(13);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao da mentoria de Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(cursoOne);
//
//        System.out.println(cursoTwo);
//        System.out.println(mentoria);

        Bootcamp bootcamp  = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao BootCamp Java");
        bootcamp.getConteudos().add(cursoOne);
        bootcamp.getConteudos().add(cursoTwo);
        bootcamp.getConteudos().add(mentoria);

        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Guilherme:" + devGuilherme.getConteudosInscritos());
        devGuilherme.progredir();
        System.out.print("\n");
        System.out.println("Conteudos Inscritos Guilherme:" + devGuilherme.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Guilherme:" + devGuilherme.getConteudosConcluidos());
        System.out.println("XP:" + devGuilherme.calcularTotalXP());



        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("\nConteudos Inscritos Lucas:" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        devLucas.progredir();
        System.out.print("\n");

        System.out.println("Conteudos Inscritos Lucas:" + devLucas.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Lucas:" + devLucas.getConteudosConcluidos());
        System.out.println("XP:" + devLucas.calcularTotalXP());






    }

}