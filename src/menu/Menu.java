package menu;

import java.util.Scanner;
import internationalization.LanguageManager;

/**
 * Displays the coffee machine menu
 * the menu supports multiple languages using the languageManager.
 * @author Ross.
 */
public class Menu {
    private Scanner input;
    private LanguageManager translate;

    /**
     * Creates a menu using the provided LanguageManager for translations.
     * @param translate language manager used to display text in the selected language
     */
    public Menu(LanguageManager translate) {
        input = new Scanner(System.in);
        this.translate = translate;
    }

    /**
     * Displays the menu and prompts the user to choose an option.
     * @return the users selected menu option
     */
    public int showMenu(){
        System.out.println("___" + translate.get("menu.title") + "___");
        System.out.println("1. " + translate.get("menu.latte"));
        System.out.println("2. " + translate.get("menu.americano"));
        System.out.println("3. " + translate.get("menu.expresso"));
        System.out.println("4. " + translate.get("menu.language"));
        System.out.println("0. " + translate.get("menu.exit"));
        System.out.print(translate.get("menu.choose") + " ");

        int choice = input.nextInt();

        return choice;
    }
}
