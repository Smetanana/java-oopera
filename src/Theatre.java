import java.util.Scanner;

public class Theatre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Система управления театром ");

        // 1. Ввод режиссера
        System.out.println("\n--- Регистрация Режиссера ---");
        System.out.print("Введите имя: ");
        String dirName = scanner.nextLine();
        System.out.print("Введите фамилию: ");
        String dirSurname = scanner.nextLine();
        System.out.print("Введите пол (MALE/FEMALE): ");
        Person.Gender dirGender = Person.Gender.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Количество поставленных спектаклей: ");
        int dirShows = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после nextInt()

        Director director = new Director(dirName, dirSurname, dirGender, dirShows);

        // 2. Ввод спектакля
        System.out.println("\n--- Создание спектакля ---");
        System.out.print("Введите название спектакля: ");
        String showTitle = scanner.nextLine();
        System.out.print("Введите длительность (в минутах): ");
        int showDuration = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        Show show = new Show(showTitle, showDuration, director);
        System.out.println("\nСпектакль \"" + show.getTitle() + "\" успешно создан!");

        // 3. Цикл интерактивного добавления актеров
        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить актера");
            System.out.println("2. Показать список актеров");
            System.out.println("3. Выйти из программы");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            if (choice == 1) {
                System.out.println("\n--- Новый актер ---");
                System.out.print("Имя: ");
                String actorName = scanner.nextLine();
                System.out.print("Фамилия: ");
                String actorSurname = scanner.nextLine();
                System.out.print("Пол (MALE/FEMALE): ");
                Person.Gender actorGender = Person.Gender.valueOf(scanner.nextLine().toUpperCase());
                System.out.print("Рост (в метрах, например, 1.85): ");
                double actorHeight = scanner.nextDouble();
                scanner.nextLine(); // Очистка буфера

                Actor actor = new Actor(actorName, actorSurname, actorGender, actorHeight);
                show.addActor(actor); // Здесь сработает ваша проверка на дубликаты!

            } else if (choice == 2) {
                System.out.println("\n--- Актеры спектакля \"" + show.getTitle() + "\" ---");
                show.printListOfActors();
            } else if (choice == 3) {
                System.out.println("Программа завершена. До свидания!");
                break;
            } else {
                System.out.println("Неверный пункт меню.");
            }
        }
        scanner.close();
    }
}
