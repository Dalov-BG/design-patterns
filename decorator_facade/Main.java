package decorator_facade;

public class Main {

    public static void main(String[] args) {

        BurgerResuturant burgerResuturant = new BurgerResuturant();

        burgerResuturant.setBuilder(new CheeseBurgerBuilder());

        buildBurger(burgerResuturant);

       
    }

    private static void buildBurger(BurgerResuturant burgerResuturant) {
        Burger burger = burgerResuturant.buildBurger();

        burger.print();
    }
}
