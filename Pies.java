import java.util.Scanner;
public class Pies {

    public static boolean getYN() {
        boolean YN = false;
        System.out.print("0=No, 1=Yes >");
        YN = (intInput()==1);
        return YN;
    }
    
    public static void printMenu(double[] price){
        String[] menuTitles = {"Plain Pizza", "Peperoni Pizza", "Slice of Cherry Pie", "Charms"};
        for (int i=0;i<=3;i++){
            System.out.printf("(%d)%-30s%04.2f\n", (i+1),menuTitles[i],price[i]);
        }
        /* System.out.printf("(1)%-30s%.2f\n(2)%-30s%.2f\n(3)%-30s%.2f\n(4)%-30s%4.2f\n", menuTitles[0],price[0],menuTitles[1],price[1],menuTitles[2],price[2],menuTitles[3],price[3]); */
    }
    
    public static int intInput(){
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()){
            if (sc.hasNextInt()){
                return sc.nextInt();
            } else {
                String throwaway = sc.next();
            }
        }
        
        if (!sc.hasNext()){
            System.out.println("You needed to enter an integer");
            return 0;
        }
        return 0;
    }
    

    public static void main(String[] args) {
        //Isaac B Goss 
        //CS 0401 MW 1:00
        //So this thing...
        boolean notherCustomer;
        Scanner sc = new Scanner(System.in);
        double[] prices = {10.,12.,2.,50.};
        double[] dprices = {10., 10., 2., 45.}; // "discounted" prices, dprices.
        //plain pizza, peperoni pizza, cherry pie slice, charm
        do { //The "customer" context/scope
            
            System.out.println("Will you be shopping with your Lucky Pie Card today?");
            boolean hasPieCard = getYN();
            int slicesPie=0;
            int plainPizza=0;
            int pepPizza=0;
            int charms=0;
            int[] cart = {slicesPie, plainPizza, pepPizza, charms};
            boolean moreItems;
            do { //the "item" scope.
                
                System.out.println("What are we getting today?");
                //Print options
                if (hasPieCard){
                    printMenu(dprices);
                } else {
                    printMenu(prices);
                }
                System.out.println("(5)Remove an item");
                
                //get the chosen option, check for invalid numbers
                System.out.print("What'll it be? >");
                int chosenItem = intInput();
                
                //set up switch block to pick what cashier chose
                
                int numChosen=0;
                switch (chosenItem) {
                    case 1: case 2: case 3: case 4:
                        System.out.print("How many would you like? >");
                        cart[(chosenItem-1)]+=intInput();
                        break;
                    case 5:
                        
                        System.out.println("Oh, what would you like to remove?");
                        if (hasPieCard) {
                            printMenu(dprices);
                        } else {
                            printMenu(prices);
                        }
                        System.out.print("What'll it be? >");
                        chosenItem=intInput();
                        
                        boolean invalidInput=false;
                        do {//Check that we don't have neg number in cart
                            
                            System.out.print("How many are we removing? >");
                            numChosen=intInput();
                            if ((cart[(chosenItem-1)]-numChosen)>=0){
                                cart[(chosenItem-1)]-=numChosen;
                                invalidInput=false;
                            } else {
                                System.out.printf("Sorry, you tried to remove too many items! We don't pay you money! You can only remove %d of that item. Try again.\n", cart[(chosenItem-1)]);
                                //we have some error state.
                                invalidInput=true;
                            }
                        } while (invalidInput);
                            
                        break;
                    default:
                        //we had an illigitimate input
                }//*/
                
                //add that much to price
                //Checking for more items.
                
                System.out.println("Will there be anything else?");
                moreItems = getYN();
            } while (moreItems);
            //math
            //print out
            System.out.print("Is there another customer?");
            notherCustomer = getYN();
        } while (notherCustomer);

    }
}