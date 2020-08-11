public class Main {
    public static void main(String[] args){
        //User user = new User("tyagur@gmail.com","Gfhjkm123!");
        User user = new User("Name","SecondName","email@gmail.com","Gfhjkm123!", "0661231212","123456");

        if ((user.getPass().length()>=8)&&(user.getPass().length()<=16)){
            System.out.println("Correct password");
            System.out.println("Password: " + user.getPass());}
        else System.out.println("Incorrect password! Password should be min 8 max 16 symbols!");

        int j=0;
        String strMail = user.getEmail();
        char [] charArr = strMail.toCharArray();
        for (int i=0; i< charArr.length; i++) {
           if (charArr[i]=='@')
              j++;
        }
        if (j==1){
            System.out.println("Correct email.");
            System.out.println("Email: " + user.getEmail());}
        else
            System.out.println("Incorrect email. Email should contain one '@' !");

        System.out.println("Name: " + user.getName());
        System.out.println("Second name: " + user.getSecName());
        System.out.println("Mob phone: " + user.getMPhone());
        System.out.println("Work phone: " + user.getWPhone());

        Worker worker = new Worker("mailmail@gmail.com", "Parol2015",1000.0,1);
        Worker worker1 = new Worker("Name1", "SecName1","email@gmail.com","Password1","0661233445","123456",20000, 5);
        Worker worker2 = new Worker("post@gmail.com","Password",5000, 6);
        worker.IncrSalary();
        worker1.IncrSalary();
        worker2.IncrSalary();

    }
}
