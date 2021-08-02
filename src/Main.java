public class Main {
    public static void main(String[] args) {
        Person timCook = new Person("Timothy Donald Cook", 60, 10.5);
        Company apple = new Company(timCook, "Apple", 1000000000);

        Person satyaNadella = new Person("Satya Nadella", 53, 19.7);
        Company microsoft = new Company(satyaNadella, "Microsoft", 60000000);

        apple.sayName();
        System.out.println(apple.ceo.name);

        microsoft.sayName();
        System.out.println(microsoft.ceo.name);

        ChangerOfCompanyCEO changer = new ChangerOfCompanyCEO();
        changer.changeCEO(apple, microsoft);

        apple.sayName();
        System.out.println(apple.ceo.name);

        microsoft.sayName();
        System.out.println(microsoft.ceo.name);
    }
    public static void changeColor(Company company, int newProfit){
        company.profit = newProfit;
    }
}
