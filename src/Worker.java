public class Worker extends User {
    private int experience;
    private double salary;

    public Worker(String email, String password, double salary,int experience) {
        super(email, password);
        this.salary = salary;
        this.experience = experience;
    }

    public Worker(String name, String secName, String email, String password, String mNumber, String wNumber, double salary, int experience) {
        super(name, secName, email, password, mNumber, wNumber);
        this.salary = salary;
        this.experience = experience;
    }
    public void IncrSalary() {
        if (this.experience<2) {
            this.salary = this.salary*1.05;
            System.out.println("Salary is increase on 5%: " +this.salary);
        }
        else if ((this.experience>=2)&&(this.experience<=5)){
            this.salary = this.salary*1.1;
            System.out.println("Salary is increase on 10%: " +this.salary);
           }
        else {
            this.salary = this.salary * 1.15;
            System.out.println("Salary is increase on 15%: " +this.salary);
        }

    }


}
