import java.util.*;

public class AlunoController {
    public static void main(String[] args) {
        // Atividade 1.a:
        Aluno al1 = new Aluno();
        System.out.println(al1);
        Aluno al2 = new Aluno();
        System.out.println(al2);
        Aluno al3 = new Aluno(3,333333333, "Carlos", "Santana", "carlos@gmail.com");
        System.out.println(al3);
        Aluno al4= new Aluno(4,444444444, "Daniel", "Portabello", "daniel@gmail.com");
        System.out.println(al4);
        Aluno al5 = new Aluno("Ezequiel", "Pomodoro");
        System.out.println(al5);
        Aluno al6 = new Aluno("Fabricio", "Junior");
        System.out.println(al6);

        // Atividade 1.b:
        al1.setId(1);
        al1.setCpf(111111111);
        al1.setNome("Ariel");
        al1.setSobrenome("Medeiros");
        al1.setEmail("ariel@gmail.com");

        System.out.println(al1.getId());
        System.out.println(al1.getCpf());
        System.out.println(al1.getNome());
        System.out.println(al1.getSobrenome());
        System.out.println(al1.getEmail());

        al2.setId(2);
        al2.setCpf(222222222);
        al2.setNome("Baudurcio");
        al2.setSobrenome("Propanolol");
        al2.setEmail("baudurcio@gmail.com");

        System.out.println(al2.getId());
        System.out.println(al2.getCpf());
        System.out.println(al2.getNome());
        System.out.println(al2.getSobrenome());
        System.out.println(al2.getEmail());

        // Atividade 2:
        al5.setId(5);
        al6.setId(6);

        List<Aluno> alunoList = new ArrayList<>();
        alunoList.add(al1);
        alunoList.add(al2);
        alunoList.add(al3);
        alunoList.add(al4);
        alunoList.add(al5);
        alunoList.add(al6);
        System.out.println("\nLista de Alunos:\n" + alunoList);

        Map<Integer, Aluno> alunoMap = new HashMap<>();
        alunoMap.put(al1.getId(), al1);
        alunoMap.put(al2.getId(), al2);
        alunoMap.put(al3.getId(), al3);
        alunoMap.put(al4.getId(), al4);
        alunoMap.put(al5.getId(), al5);
        alunoMap.put(al6.getId(), al6);
        System.out.println("\nMapa da Alunos:\n" + alunoMap);

        Aluno alunoId5 = alunoList.stream().filter(a -> a.getId() == 5).findAny().orElse(null);
        System.out.println("\nAluno 5 na Lista: " + alunoId5);

        System.out.println("\nAluno 5 no Mapa: " + alunoMap.get(3));

        alunoList.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println("\nLista de Alunos Decrescente:" + alunoList);

    }
}
