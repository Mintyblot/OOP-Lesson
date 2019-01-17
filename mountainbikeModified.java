public class MountainBike extends Bicycle { // polymorphism
    private String suspension; // data encapusulation 

    public MountainBike( // adding new varialbe. variable include startCadence, startSpeed, startGear
               int startCadence,
               int startSpeed,
               int startGear,
               String suspensionType){ // this string allows for the display of the initial varables by pulling from parent 
        super(startCadence,
              startSpeed,
              startGear);
        this.setSuspension(suspensionType);
    }

    public String getSuspension(){ // this string pulls suspension 
      return this.suspension;
    }

    public void setSuspension(String suspensionType) { // this method sets the suspension type
        this.suspension = suspensionType;
    }

    public void printDescription() { // this method displays the variables 
        super.printDescription(); // this super utilies the string on line 15 to pull the suspension type
        System.out.println("The " + "MountainBike has a" + // prints out all variables 
            getSuspension() + " suspension.");
    }
} 
