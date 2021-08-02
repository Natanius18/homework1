public class Company {
    Person ceo;
    String name;
    int profit;
    public Company(){}
    public Company(Person ceoOfCompany, String nameOfCompany, int profitOfCompany){
        ceo = ceoOfCompany;
        name = nameOfCompany;
        profit = profitOfCompany;
    }
    void sayName(){
        System.out.println("This company is called " + name + ". The CEO of the company is " + ceo.name);
    }
}
