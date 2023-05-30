
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

        geekBrains.addVacancy(new Vacancy("null", 20000));
        geekBrains.addVacancy(new Vacancy("null", 35000));
        google.addVacancy(new Vacancy("null", 15000));
        google.addVacancy(new Vacancy("null", 37000));
        yandex.addVacancy(new Vacancy("null", 25000));
        yandex.addVacancy(new Vacancy("null", 36000));
        yandex.addVacancy(new Vacancy("null", 10000));
        epam.addVacancy(new Vacancy("null", 15000));
        epam.addVacancy(new Vacancy("null", 150000));

        Master ivanov = new Master("Ivanov");
        Master sidorov = new Master("Sidorov");
        Student petrov = new Student("Petrov");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(petrov);

        for (int i = 0; i < 5; i++){
            System.out.printf("Попытка найти сотрудника %d\n", i + 1);
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }

    }

}
