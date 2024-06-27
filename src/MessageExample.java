import java.util.Scanner;

public class MessageExample {
    public static void main(String[] args) {
          /* 1. Создайте класс Message. Этот класс будет позволять хранить в себе сообщение любого типа.
        2. Для того, чтобы Message мог хранить в себе любой тип данных, создайте поле в этом классе, тип которого будет является дженериком
         3.1 Если пользователь хочет положить строку - создайте Message<String> и дайте пользователю ввести строку
        3.2 Если же пользователь хочет положить число - создайте Message<Integer> и дайте пользователю ввести число*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("В ведите строку:");

        Message<String> stringMessage = new Message<>();
        stringMessage.setMessage(scanner.nextLine());
        System.out.println("Вы ввели строку: " + stringMessage.getMessage());

        System.out.println("Введите число:");

        Message<Integer> integerMessage = new Message<>();
        integerMessage.setMessage(scanner.nextInt());

        System.out.println("Вы ввели число:" + integerMessage.getMessage());




    }


}

