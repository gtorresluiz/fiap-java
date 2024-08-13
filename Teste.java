import java.util.*;

public class Teste{

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Maria", "123456", 30);
        Pessoa pessoa2 = new Pessoa("João", "789101", 25);
        Pessoa pessoa3 = new Pessoa("Ana", "112131", 28);
        Pessoa pessoa4 = new Pessoa("Maria", "123456", 30); 

        adicionarPessoa(pessoas, pessoa1);
        adicionarPessoa(pessoas, pessoa2);
        adicionarPessoa(pessoas, pessoa3);
        adicionarPessoa(pessoas, pessoa4);

        System.out.println("Lista antes de remover duplicados: " + pessoas);

        List<Pessoa> pessoasSemDuplicados = removerDuplicados(pessoas);
        System.out.println("Lista depois de remover duplicados: " + pessoasSemDuplicados);

        Map<String, Pessoa> mapaPessoas = new HashMap<>();
        adicionarPessoaAoMapa(mapaPessoas, pessoa1);
        System.out.println("Pessoa no mapa: " + obterPessoaDoMapa(mapaPessoas, "123456"));

        ordenarLista(pessoasSemDuplicados, true);
        System.out.println("Lista em ordem crescente: " + pessoasSemDuplicados);

        ordenarLista(pessoasSemDuplicados, false);
        System.out.println("Lista em ordem decrescente: " + pessoasSemDuplicados);
    }

    public static List<Pessoa> adicionarPessoa(List<Pessoa> pessoas, Pessoa pessoa) {
        pessoas.add(pessoa);
        return pessoas;
    }

    public static List<Pessoa> removerDuplicados(List<Pessoa> pessoas) {
        Set<Pessoa> setPessoas = new HashSet<>(pessoas);
        return new ArrayList<>(setPessoas);
    }

    public static void adicionarPessoaAoMapa(Map<String, Pessoa> mapa, Pessoa pessoa) {
        mapa.put(pessoa.getDocumento(), pessoa);
    }

    public static Pessoa obterPessoaDoMapa(Map<String, Pessoa> mapa, String documento) {
        return mapa.get(documento);
    }

    public static void ordenarLista(List<Pessoa> pessoas, boolean crescente) {
        pessoas.sort((p1, p2) -> {
            if (crescente) {
                return Integer.compare(p1.getIdade(), p2.getIdade());
            } else {
                return Integer.compare(p2.getIdade(), p1.getIdade());
            }
        });
    }
}
