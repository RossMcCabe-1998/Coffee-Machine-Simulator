import coffeetype.*;
import exceptions.InvalidCoffeeException;
import internationalization.LanguageManager;
import menu.Menu;
import sounds.SoundPlayer;

/**
 * Entry point for Coffee Machine
 * Displays the menu, handles user input and controls coffee preparation.
 * @author Ross.
 */
public class Main {

    /**
     * Main method that runs the coffee machine.
     * @param args unused.
     */
    public static void main(String[] args){

        LanguageManager translate = new LanguageManager();
        Menu menu = new Menu(translate);
        boolean running = true;

        while(running){

            try {
                int choice = menu.showMenu();
                Coffee coffee = null;

                // creates coffee based on user input
                if (choice == 1) {
                    coffee = new Latte();
                } else if (choice == 2) {
                    coffee = new Americano();
                } else if (choice == 3) {
                    coffee = new Expresso();
                } else if (choice == 4) {
                    // language swap
                    if(translate.get("menu.title").equals("Coffee Machine")){
                        translate.setFrench();
                    } else {
                        translate.setEnglish();
                    }
                    continue;

                } else if (choice == 0) {
                    System.out.println(translate.get("msg.goodbye"));
                    running = false;
                    continue;
                } else {
                    throw new InvalidCoffeeException(translate.get("msg.invalid"));
                }
                // print message for making specific coffee
                System.out.println(translate.get("msg.making") + coffee.getName() + "...");
                SoundPlayer.playSound(coffee.getSoundFile());

                try {
                    // set thread to sleep for amount of brewTime seconds
                    Thread.sleep((long)coffee.getBrewTime() * 1000);
                } catch (InterruptedException e) {
                    System.out.println(translate.get("msg.error"));
                }
                // print message for ready specific coffee
                System.out.println(translate.get("msg.ready") + " " + coffee.getName());
                System.out.println();

            } catch (InvalidCoffeeException e){
                System.out.println(e.getMessage());
                System.out.println();
            }
        }
    }
}
