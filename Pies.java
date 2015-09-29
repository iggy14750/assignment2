import java.utils.Scanner;
public class Pies {
    public static void main(String[] args) {
        //Isaac B Goss 
        //CS 0401 MW 1:00
        //So this thing...
        Scanner sc = new Scanner(System.in);
        float[] prices = {10.,12.,2.,50.};
        //plain pizza, peperoni pizza, cherry pie slice, charm
        while true {
            System.out.print("Is there another customer? 1=Yes/0=No >");
            notherCustomer = 0;
            if (sc.hasNextInt()){
                notherCustomer = sc.nextInt();
            }
            if (notherCustomer==0) {
                System.exit(0);
            }
            do {
                //Do you have a Lucky Pie Card?
                Sytem.out.println("Will you be shopping with your Lucky Pie Card today?");
                hasPieCard = getYN();
                //If so, affect prices
                float[] dprices = new float[4];//"displayed"prices, or dprices
                if (hasPieCard) {
                    for (int i=0;i++;i<4) {
                        float discount = 0;//I don't remember what the discount is rn.
                        dprices[i] = prices[i]*discount;
                System.out.println("What are we getting today?");
                //Print options
                
                //get the chosen option, check for invalid numbers
                //set up if block to pick what cashier chose
                //if (pizza) { choose number of slices }
                //if (pie) { if (slices==6) { it's a pie; return 10. } else { return slices*2; } }
                //add that much to price
                //Checking for more items.
                boolean moreItems = false;
                System.out.println("Will there be anything else?");
                moreItems = getYN();
                } while (moreItems)
            //math
            //print out 
        }
        public static boolean getYN() {
            Scanner sc = new Scanner(System.in);
            boolean YN = false;
            Syetem.out.print("0=No, 1=Yes >");
            if sc.hasNextInt() {
                YN = (sc.nextInt==1);
            }
        }
    }
}