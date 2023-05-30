
public class Program {

    /**
     * TODO: Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     * @param args
     */
    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", jobAgency);
        Company google = new Company("Google", jobAgency);
        Company yandex = new Company("Yandex", jobAgency);
        Company epam = new Company(null, jobAgency);

        Master ivanov = new Master("Ivanov");
        Master sidorov = new Master("Sidorov");
        Student petrov = new Student("Petrov");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(petrov);

        for (int i = 0; i < 10; i++){
            System.out.printf("Попытка найти сотрудника %d\n", i + 1);
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }

    }

}
