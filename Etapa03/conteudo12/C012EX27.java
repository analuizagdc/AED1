import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C012EX27 {
    public static void main(String[] args) {
            //MODULARIZAR !!!
        List<String> listEndereco = new ArrayList<>();
        List<Integer> listCPF = new ArrayList<>();

        String endereco;
        int cpf;

        Scanner input = new Scanner(System.in);

        // adicionando endereços e CPFs
        do {
            System.out.println("Digite seu endereço ('fim' para finalizar) -> ");
            endereco = input.nextLine();

            if (!endereco.equalsIgnoreCase("fim")) {
                System.out.println("Digite seu CPF -> ");
                cpf = input.nextInt();
                input.nextLine(); 

                listEndereco.add(endereco);
                listCPF.add(cpf);

            } else {
                System.out.println("Leitura de dados finalizada!! ");
                break;
            }

        } while (!endereco.equalsIgnoreCase("fim"));

        // pesquisa e manipulação dos componentes da lista

        while (true) {
            System.out.println("Digite o CPF que procura (Digite '0' para finalizar) -> ");
            int pesquisaCPF = input.nextInt();
            input.nextLine();  

            if (pesquisaCPF == 0) {
                break;
            }

            int pos = listCPF.indexOf(pesquisaCPF);

            //COLOCAR ISSO EM UMA CLASS PARA ALTERACAO DE LISTA
            if (pos != -1) {
                System.out.println("CPF encontrado!!");
                System.out.println("Deseja alterar ou excluir o CPF ou endereço? (Digite |A|-Alterar  |E|-Excluir  |N|-Não mudar nada) -> ");
                String alteracao = input.nextLine().toUpperCase();

                if (alteracao.equalsIgnoreCase("A")) {
                    System.out.println("Novo endereço -> ");
                    String novoEndereco = input.nextLine();

                    System.out.println("Novo CPF -> ");
                    int novoCPF = input.nextInt();
                    input.nextLine();

                    listEndereco.set(pos, novoEndereco);
                    listCPF.set(pos, novoCPF);
                    System.out.println("Itens atualizados com sucesso!!");

                   
                } else if (alteracao.equalsIgnoreCase("E")) {
                    System.out.println("Tem certeza que deseja excluir? |S|-Sim  |N|-Não");
                    String verificacaoDeExclusao = input.nextLine().toUpperCase();

                    if(verificacaoDeExclusao.equalsIgnoreCase("S")){
                        listEndereco.remove(pos);
                        listCPF.remove(pos);
                        System.out.println("Itens removidos com sucesso!!");

                    } else {
                        System.out.println("Itens nao removidos!!");
                        continue;
                    }

                } else if (alteracao.equalsIgnoreCase("N")) {
                    System.out.println("Dados não alterados!");
                }

                
            } else {
                System.out.println("CPF não encontrado!!");
                System.out.println("Deseja adicionar o CPF com um novo endereço? |S|-Sim  |N|-Não ");
                String adicionar = input.nextLine().toUpperCase();

                if (adicionar.equalsIgnoreCase("S")) {
                    System.out.println("Digite o endereço que deseja adicionar -> ");
                    String novoEndereco = input.nextLine();

                    System.out.println("Digite o CPF que deseja adicionar -> ");
                    int novoCPF = input.nextInt();
                    input.nextLine(); 

                    listEndereco.add(novoEndereco);
                    listCPF.add(novoCPF);

                    System.out.println("Endereço e CPF adicionados com sucesso! ");
                } else {
                    System.out.println("Sem alterações !!");
                }
            }
        }

        // Exibe a lista de endereços e CPFs
        System.out.println("Lista de endereços: " + listEndereco);
        System.out.println("Lista de CPFs: " + listCPF);

        input.close();
    }
}
