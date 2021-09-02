package HomeWork5;

public class HomeWork5 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов Иван Иванович", "Генеральный директор", "qwerty@mail.ru", "322-22-32", 325000.00f, 37);
        Employee employee2 = new Employee("Потапова Наталья Николаевна", "Главный бухгалтер", "buh@mail.ru", "322-55-66", 120000.00f, 55);
        Employee[] workers = {
                employee1, employee2,
                new Employee("Петров Петр Петрович", "Коммерческий директор", "qwerty123@mail.ru", "400-11-32", 150000.00f, 33),
                new Employee("Пупкин Василий Петрович", "Менеджер", "pupkin123@mail.ru", "500-22-32", 100000.00f, 28),
                new Employee("Сидорова Марья Ивановна", "экономист", "sidorova@mail.ru", "325-00-65", 80000.00f, 24)};
        getAllPersonsInOffice(workers);
        System.out.println("***************");
        OldEmployee(workers, 40);
    }

    private static void getAllPersonsInOffice(Employee[] workers) {
        System.out.println("All person: ");
        for (int i = 0; i < workers.length; i++) {
            System.out.println((i + 1) + " " + workers[i].getInfo());
        }
    }

    private static void OldEmployee(Employee[] workers, int age) {
        for (int i = 0; i < workers.length; i++)
            if (workers[i].getAge() > age)
                System.out.println(workers[i].getInfo());
                      }
    }





