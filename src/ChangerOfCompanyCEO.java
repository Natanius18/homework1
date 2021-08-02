public class ChangerOfCompanyCEO {
    void changeCEO(Company company1, Company company2){
        Person ceo1 = company1.ceo;
        company1.ceo = company2.ceo;
        company2.ceo = ceo1;
        System.out.println("The exchange was successful!");
    }
}
