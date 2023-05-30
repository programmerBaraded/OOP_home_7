
public class Master implements Observer {
    private  String name;
    private double salary;
    // private String vacancy;

    public Master(String name) {
        this.name = name;
        salary = 80000;
        // this.vacancy = vacancy;
        // vacancy = "devops";
    }

    @Override
    public void receiveOffer(String companyName, double salary, String vacancy) {
        if (this.salary < salary){
            System.out.printf("Мастер %s >>> Мне нужна эта работа! [%s - %.2f - %s]\n", name, companyName, salary, vacancy);
            this.salary = salary;
        }
        else {
            System.out.printf("Мастер %s >>> Я найду работу получше! [%s - %.2f - %s]\n", name, companyName, salary, vacancy);
        }
    }
}
