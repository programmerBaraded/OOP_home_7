
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company {

    private Random random;
    private String nameCompany;
    // private double maxSalary;
    private List<Vacancy> vacancies = new ArrayList<>();
    private Publisher jobAgency;


    public Company(String nameCompany, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    /**
     * TODO: Доработать метод, компания должна генерировать объект "Вакансия" и передавать
     *  объект в агенство.
     * Поиск сотрудника
     */
    public void needEmployee(){
        for (Vacancy vacancy : vacancies) {
            double salary = random.nextDouble(3000);
            jobAgency.sendOffer(nameCompany, salary, vacancy.getVacancy());
        }
        
    }

    public void addVacancy (Vacancy vacancy){
        vacancies.add(vacancy);
    }

    public void removeVakancy(Vacancy vakancy) {
        vacancies.remove(vakancy);
    }

}
