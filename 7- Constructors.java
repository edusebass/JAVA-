public class Store {
  
  // new method: constructor!
  public Store() {
    System.out.println("I am inside the constructor method.");
  }
  
  // main method is where we create instances!
  public static void main(String[] args) {
    System.out.println("Start of the main method.");
    
    // create the instance below
    Store lemonadeStand = new Store();
    // print the instance below
    System.out.println(lemonadeStand);
  }
}

/*
Review the order of the printed messages:

Running the program invokes main()
We create an instance so we move from main() to Store()
The code inside Store() runs
When Store() finishes execution, we return to main()
*/
