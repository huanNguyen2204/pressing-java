package org.example.ch7;

public class Chapter7 {
    public static void main(String[] args) {
        City candyTown = new City("Candy Town");
        Player pillLady = new Player();

        pillLady.travelTo(candyTown);
        System.out.println(pillLady.currentLocation());

        pillLady.travelTo(new City("Giant City"));
        System.out.println(pillLady.currentLocation());

        Player reese = new Player();
        reese.buy(new Candy("Kitty Katty", 200));
        reese.buy(new Candy("P&Ps", 250));
        reese.buy(new Candy("Snackers", 200));
        reese.buy(new Candy("Snackers", 300));
        reese.buy(new Candy("Huan Nguyen", 350));
        reese.listCandies();

        System.out.println(reese.eat("Chick-o-Stick"));
        System.out.println(reese.eat("Kitty Katty"));

        reese.listCandies();
        reese.buy(new Candy("Kitty Katty", 200));
        reese.buy(new Candy("Kitty Katty", 200));

        System.out.println(reese.eat("Kitty Katty"));
        reese.listCandies();

        Workout walking = new Workout();
        walking.about = "Go for a run";
        walking.duration = 30;
        walking.caloriesBurned = 200;

        Nap sleeping = new Nap();
        sleeping.about = "Recreational sleep";
        sleeping.duration = 60;
    }
}
