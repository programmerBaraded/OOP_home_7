public class Midle implements Observer{
    private String vacancy;
    private String name;
    private double salary;

    public Midle(String name){
        this.name = name;
        salary = 90000;
        this.vacancy = vacancy;
        vacancy = "developer";
    }



    @Override
    public void receiveOffer(String companyName, double salary) {
        if (this.salary < salary){
            System.out.printf("Мидл %s >>> Мне нужна эта работа! [%s - %f]\n", name, companyName, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Мидл %s >>> Я найду работу получше! [%s - %f]\n", name, companyName, salary);
        }
        
    }

}
