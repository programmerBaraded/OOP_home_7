public class Midle implements Observer{
    // private String vacancy;
    private String name;
    private double salary;

    public Midle(String name){
        this.name = name;
        salary = 90000;
        // this.vacancy = vacancy;
        // vacancy = "developer";
    }



    @Override
    public void receiveOffer(String companyName, double salary, String vacancy) {
        if (this.salary < salary){
            System.out.printf("Мидл %s >>> Мне нужна эта работа! [%s - %.2f - %s]\n", name, companyName, salary, vacancy);
            this.salary = salary;
        }
        else {
            System.out.printf("Мидл %s >>> Я найду работу получше! [%s - %.2f - %s]\n", name, companyName, salary, vacancy);
        }
        
    }

}
