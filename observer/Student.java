
public class Student implements Observer {

    private  String name;
    private double salary;
    // private String vacancy;

    public Student(String name) {
        this.name = name;
        salary = 35000;
        // this.vacancy = vacancy;
        // vacancy = "rabGalerny";
    }

    @Override
    public void receiveOffer(String companyName, double salary, String vacancy) {
        if (this.salary < salary){
            System.out.printf("Студент %s >>> Мне нужна эта работа! [%s - %f]\n", name, companyName, salary, vacancy);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s >>> Я найду работу получше! [%s - %f]\n", name, companyName, salary, vacancy);
        }
    }
}
