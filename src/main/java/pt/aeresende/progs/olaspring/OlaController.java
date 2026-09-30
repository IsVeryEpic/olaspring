package pt.aeresende.progs.olaspring;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {
    @GetMapping("/ola")
    public String ola() {
        return "Olá, 3F!";
    }

    @GetMapping("/saudacao")
    public String saudacao(@RequestParam(defaultValue = "visitante") String nome) {
        return "Olá, " + nome + "!";
    }

    @GetMapping("/api/aluno")
    public Aluno aluno() {
        return new Aluno(1, "Ana Silva", "3F");
    }

    @GetMapping("/api/turma")
    public List<Aluno> turma() {
        return List.of(
            new Aluno(1, "Ana Silva", "3F"),
            new Aluno(2, "Rita Costa", "3F"),
            new Aluno(3, "Pedro Santos", "3F")
        );
    }

    public record Lancamento(int valor, LocalDateTime data) { }

    @GetMapping("/api/dado")
    public Lancamento dado() {
        int valor = ThreadLocalRandom.current().nextInt(1, 7);
        return new Lancamento(valor, LocalDateTime.now());
    }
}
