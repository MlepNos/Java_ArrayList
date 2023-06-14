import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


             GroceryList();

    }
    public static void PrintActions(){
     String TextBlock= """
        Available Actions:

        0 - to Shutdown

        1 - to add Item(s) to list (coma delimited list)

        2 - to remove any item (coma delimited List)

        Enter a number for which action you want to:
             """;
       System.out.print(TextBlock+  " ");

    }

    public static void GroceryList(){
        ArrayList<String> Groceries = new ArrayList<>();
        boolean flag = true;
         while(flag){
             PrintActions();
             switch (Integer.parseInt(scanner.nextLine())){
                 case 1 -> addItem(Groceries);
                 case 2 -> removeItem(Groceries);
                 default -> flag = false;
             }
             Groceries.sort(Comparator.naturalOrder());
             System.out.println(Groceries);
        }
    }
    private static void addItem(ArrayList<String> Groceries){

      System.out.println("add Item(s) to list [seperate items by comma]: ");
      String[]  items = scanner.nextLine().split(",");
        for(String item : items){
            String trimmed = item.trim();
            if(Groceries.indexOf(trimmed) <0 ){
                Groceries.add(trimmed);
            }
        }
    }

    private static void removeItem(ArrayList<String> Groceries){
        System.out.println("Remove Item(s) from the list [seperate items by comma]: ");
        String[]  items = scanner.nextLine().split(",");
        for(String item : items){
            String trimmed = item.trim();
            Groceries.remove(trimmed);
        }
    }


    /* Array Lists

        String[] items = {"apples","bananas","eggs"};
        System.out.println(items);
        System.out.println(items[1]);
        System.out.println("-------------------------------------------------------------");

        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println("-------------------------------------------------------------");

        ArrayList<String> groceries = new ArrayList<>(list);
        System.out.println(groceries);
        groceries.add("milk");
        groceries.add("banana");
        System.out.println(groceries);
        groceries.add(5,"bananas"); // banana is changed to bananas
        System.out.println(groceries);
        groceries.set(1,"butters"); //
        System.out.println("-------------------------------------------------------------");

        ArrayList<String> nextList = new ArrayList<>(
                List.of("name","surname","ID"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        //Accesing and getting elements from ArrayList
        System.out.println("Third item: " + groceries.get(2));

        if(groceries.contains("ID")){
            System.out.println("the ArrayList contains ID");
        }
        System.out.println("-------------------------------------------------------------");
        int firstIndex = groceries.indexOf("bananas");
        int LastIndex = groceries.lastIndexOf("bananas");
        System.out.println("first index of banana: " + firstIndex);
        System.out.println("Last index of banana : " +LastIndex);
        System.out.println("-------------------------------------------------------------");


        System.out.println(groceries);
        groceries.remove(1);  //butter removed
        System.out.println(groceries);
        groceries.remove("bananas"); //the first bananas will be removed
        System.out.println(groceries);


        groceries.removeAll(List.of("milk","ID"));
        System.out.println(groceries);

        groceries.retainAll(List.of("apples", "eggs", "bananas","NotExisting"));
        System.out.println(groceries);
        System.out.println("-------------------------------------------------------------");

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty: "+ groceries.isEmpty());
        System.out.println("-------------------------------------------------------------");

        groceries.addAll(List.of("apples","orange","coconuts","milk"));
        System.out.println(groceries);
        groceries.addAll(Arrays.asList("eggs","pickles","mustard"));
        System.out.println(groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        System.out.println("-------------------------------------------------------------");
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));




    Array List Challange 1
    The challenge is to create an interactive console program.
    And give the user a menu of options as shown here:

    ////////////////////////////////////////
    Available Actions:
    0 - to Shutdown
    1 - to add Item(s) to list (coma delimited list)
    2 - to remove any item (coma delimited List)
    Enter a number for which action you want to
    ///////////////////////////////////////

    Using the Scanner class, solicit a menu item, 0, 1 or 2,  and process the item accordingly
    Your grocery list should be an ArrayList.
    You should use methods on the ArrayList, to add items, remove items, check if an item is already in the list, and print a sorted list.
    You should print the list, sorted alphabetically, after each operation.
    You shouldn't allow duplicate items in the list.


     */
}