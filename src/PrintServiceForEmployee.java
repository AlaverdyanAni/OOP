public class PrintServiceForEmployee implements PrintService {
    @Override
    public void print(Person[] people) {
        System.out.println("Размер списка учтенных людей для сотрудников-" + people.length);
        printPeople(people);
        System.out.println();
    }

    @Override
    public void print(Customer[] customers) {
        System.out.println("Размер списка покупателей для сотрудников-" + customers.length);
        printPeople(customers);
        System.out.println();
    }

    @Override
    public void print(Gamer[] gamers) {
        System.out.println("Размер списка игроков для сотрудников-" + gamers.length);
        printPeople(gamers);
        System.out.println();
    }
    private   void printPeople(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println("Имя-" + person.getName() + ", Возраст-" + person.getAge() + ", Телефон-" + person.getPhoneNumber());
        }
    }
}
