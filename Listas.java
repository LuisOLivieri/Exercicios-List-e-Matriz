import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        //list - tipo e nome
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Marco");
        list.add("Bob");
        list.add("Ana");
        list.add(2,"Marco");

        System.out.println(list.size()); //TAMANHO LISTA

        for (String x: list) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M'); //PREDICADO(V OU F) - PEGA O VALOR X E ME RETONRA SE O VALOR É IGUAL A M
        for (String x: list) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Bob: " + list.indexOf("Marco"));

        System.out.println("---------------------"); //SELECIONAR APENAS A LETRA Q EU QUERO
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x: result) {
            System.out.println(x);
        }

        System.out.println("---------------------");//PEGAR O PRIMEIRO ELEMENTO COM A LETRA "A"SE NAO EXISTIR RETORNA
        // NULO
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

    }
}

//Listas: mesmo tipo(double...), ordenadas(0,1,2), inicia vazia(acrescentando ou removendo aos poucos)
//interface → LIST / Precisa de uma classe (ArrayList)
//Tamanho variável - insercoes e delecoes
