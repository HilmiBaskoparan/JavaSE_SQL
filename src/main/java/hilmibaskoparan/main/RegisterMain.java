package hilmibaskoparan.main;

import hilmibaskoparan.controller.RegisterControllerImpl;
import hilmibaskoparan.dto.RegisterDto;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegisterMain {

    // Constructor Speed Data
    public RegisterMain() throws SQLException, ClassNotFoundException {
        RegisterControllerImpl registerController = new RegisterControllerImpl();

        for (int i = 0; i <= 5; i++ ){
            RegisterDto registerDto = new RegisterDto();
            registerDto.setName("name" + i);
            registerDto.setSurname("surname"+i);
            registerDto.setEmail("email+i");
            registerDto.setPassword("password+i");
            registerController.create(registerDto);
            System.out.printf("%20s%n ",registerDto);
        }
    }

    private static int userData() {
        Scanner scan = new Scanner(System.in);
        String str = "1. INSERT\n" +
                "2. LIST\n" +
                "3. UPDATE\n" +
                "4. DELETE\n" +
                "5. FIND BY ID\n" +
                "0. QUIT";
        System.out.println(str);
        System.out.print("Select your process : ");
        int selection = scan.nextInt();

        return selection;
    }

    // CREATE
    private static RegisterDto create() throws SQLException, ClassNotFoundException {
        System.out.println("INSERT");
        RegisterControllerImpl registerController = new RegisterControllerImpl();
        Scanner scan = new Scanner(System.in);

        String name, surname, email, password;
        System.out.print("Enter your name: ");
        name = scan.nextLine();
        System.out.print("Enter your surname: ");
        surname = scan.nextLine();
        System.out.print("Enter your email: ");
        email = scan.nextLine();
        System.out.print("Enter your password: ");
        password = scan.nextLine();

        RegisterDto registerDto = new RegisterDto();
        registerDto.setName(name);
        registerDto.setSurname(surname);
        registerDto.setEmail(email);
        registerDto.setPassword(password);
        registerController.create(registerDto);
        return registerDto;
    }

    // LIST
    private static List<RegisterDto> list() {
        System.out.println("LIST");
        RegisterControllerImpl registerController = new RegisterControllerImpl();
        ArrayList<RegisterDto> list = registerController.list();

        list.forEach((temp) -> {
            //System.out.println(temp);
            System.out.printf("%d %15s %15s %15s %15s %15s", temp.getId(), temp.getName(), temp.getSurname(),
                    temp.getEmail(), temp.getPassword(), temp.getCreateDate());
            System.out.println();
            /*System.out.printf(temp.getId() + " " + temp.getName() + " " + temp.getSurname() + " " +
                    temp.getEmail() + " " + temp.getPassword() + " " + temp.getCreateDate());*/
        });

        return list;
    }

    private static RegisterDto update() {
        System.out.println("UPDATE");
        RegisterControllerImpl registerController = new RegisterControllerImpl();
        Scanner scan = new Scanner(System.in);

        String name, surname, email, password;
        System.out.print("Enter ID number to UPDATE: ");
        Long id = scan.nextLong();
        scan.nextLine();
        System.out.print("Enter your name: ");
        name = scan.nextLine();
        System.out.print("Enter your surname: ");
        surname = scan.nextLine();
        System.out.print("Enter your email: ");
        email = scan.nextLine();
        System.out.print("Enter your password: ");
        password = scan.nextLine();

        RegisterDto registerDto = RegisterDto.builder()
                .name(name)
                .surname(surname)
                .email(email)
                .password(password)
                .build();
        registerDto.setId(id);
        registerController.update(registerDto);

        return registerDto;
    }

    private static void delete() {
        System.out.println("DELETE");
        RegisterControllerImpl registerController = new RegisterControllerImpl();
        Scanner scan = new Scanner(System.in);

        RegisterDto registerDto = new RegisterDto();
        System.out.print("Enter ID number to DELETE: ");
        registerDto.setId(scan.nextLong());
        registerController.delete(registerDto);
    }

    private static RegisterDto findById() {
        System.out.println("FIND BY ID");
        RegisterControllerImpl registerController = new RegisterControllerImpl();
        Scanner scanner = new Scanner(System.in);
        RegisterDto registerDeleteDto = new RegisterDto();

        System.out.print("Enter the number id to find it: ");
        registerDeleteDto.setId(scanner.nextLong());
        RegisterDto registerDto=  registerController.findById(registerDeleteDto.getId());
        System.out.println(registerDto);
        return registerDto;
    }

    private static void logOut() {
        System.out.println("QUIT");
        System.exit(0);
    }

    private static void processSelection() throws SQLException, ClassNotFoundException {
        // Speed Data
        RegisterMain registerMain=new RegisterMain();
        // sonsuz döngü => for(;;){}

        while (true){
            int userData = userData();
            switch (userData){
                case 1:
                    create();
                    break;
                case 2:
                    list();
                    break;
                case 3:
                    list();
                    update();
                    break;
                case 4:
                    list();
                    delete();;
                    break;
                case 5:
                    list();
                    findById();;
                    break;
                case 0:
                    logOut();
                    break;

                default:
                    System.out.println("Please Enter the Numbers indicated to you ");
                    break;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        processSelection();
    }
}
