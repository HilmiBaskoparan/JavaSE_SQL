package hilmibaskoparan.main;

import hilmibaskoparan.controller.IRegisterController;
import hilmibaskoparan.controller.RegisterControllerImpl;
import hilmibaskoparan.dto.RegisterDto;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class RegisterMain {

    private static int userData() {
        Scanner scan = new Scanner(System.in);
        String str = "1. INSERT\n" +
                "2. LIST\n" +
                "3. UPDATE\n" +
                "4. DELETE\n" +
                "0. QUIT";
        System.out.println(str);
        System.out.println("Select your process : ");
        int selection = scan.nextInt();

        return selection;
    }

    private static void processSelection() throws SQLException, ClassNotFoundException {

        RegisterControllerImpl registerController = new RegisterControllerImpl();

        while (true){
            int userData = userData();
            switch (userData){
                case 1:
                    System.out.println("CREATE");
                    RegisterDto registerDtoCreate = RegisterDto.builder()
                            .name("Hilmi")
                            .surname("BASKOPARAN")
                            .email("hilmi@gmail.com")
                            .password("1234")
                            .build();
                    registerController.create(registerDtoCreate);
                    break;

                case 2:
                    System.out.println("LIST");
                    ArrayList<RegisterDto> list = registerController.list();
                    list.forEach((temp) -> {
                        System.out.println(temp);
                    });
                    break;

                case 3:
                    System.out.println("UPDATE");
                    RegisterDto registerDtoUpdate = new RegisterDto();
                    registerDtoUpdate.setId(1L);
                    // DATABASE FIND
                    // BaseDto
                    // CommandLineRunner
                    registerDtoUpdate.setName("HilmiUpdated");
                    registerDtoUpdate.setSurname("BaskoparanUpdated");
                    registerDtoUpdate.setEmail("updated@gmail.com");
                    registerDtoUpdate.setPassword("passwordUpdated");
                    registerController.update(registerDtoUpdate);
                    break;

                case 4:
                    System.out.println("DELETE");
                    RegisterDto registerDtoDelete = new RegisterDto();
                    registerDtoDelete.setId(1L);
                    registerController.delete(registerDtoDelete);
                    break;

                case 0:
                    System.out.println("QUIT");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please Enter the Numbers indicated to you ");
                    break;
            }
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        processSelection();
    }
}
