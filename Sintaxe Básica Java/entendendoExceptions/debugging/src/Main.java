import DAO.UserDAO;
import model.MenuOption;
import model.UserModel;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    private final static UserDAO dao = new UserDAO();
    private final static Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {


        //Runnable runnable = () -> System.out.println("teste");
        while (true){
            System.out.println("Bem vindo ao cadastro de usuários, seçecione a operação desejada");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Atualizar");
            System.out.println("3 -  Excluir");
            System.out.println("4 - Buscar por identificador");
            System.out.println("5 - Listar");
            System.out.println("6 - Sair");

            var userInput = scanner.nextInt();
            var selectedOption = MenuOption.values()[userInput-1];
            switch (selectedOption){
                case SAVE -> {
                    var user = dao.save(requestUserSave());
                    System.out.printf("Usuario cadastrado %s",user);
                }
                case UPDATE ->{
                    var user = dao.update(requestUserUpdate());
                    System.out.printf("Usuario atualizado %s",user);
                }
                case DELETE -> {
                    dao.delete(requestId());
                    System.out.println("Usuario excluido");
                }
                case FIND_BY_ID -> {
                    try {
                        var id = requestId();
                        var user = dao.findById(id);
                        System.out.printf("Usuários com id %s:", user);
                        System.out.println(user);
                    }catch (Exception e){

                    }
                }
                case FIND_ALL ->{
                    var users = dao.findAll();
                    System.out.println("Usuários cadastrados");
                    users.forEach(System.out::println);
                }
                case EXIT -> System.exit(0);

            }


        }


    }
    private static long requestId(){
        System.out.println("Informe o identificador do usuário: "); return scanner.nextLong();
    }
    private static UserModel requestUserSave(){
        System.out.println("Informe o nome do usuáio: "); var name = scanner.next();
        System.out.println("Informe o e-mail do usuáio: "); var email = scanner.next();
        System.out.println("Informe a sata de nascimento do usuáio (dd/mm/yyyy): "); var birthdayString = scanner.next();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString,formatter);
        return new UserModel(0,name,email,birthday);


    }
    private static UserModel requestUserUpdate(){
        System.out.println("Informe o identificador do usuário: "); var id = scanner.nextLong();
        System.out.println("Informe o nome do usuáio: "); var name = scanner.next();
        System.out.println("Informe o e-mail do usuáio: "); var email = scanner.next();
        System.out.println("Informe a sata de nascimento do usuáio (dd/mm/yyyy): "); var birthdayString = scanner.next();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString,formatter);
        return new UserModel(id,name,email,birthday);


    }

}