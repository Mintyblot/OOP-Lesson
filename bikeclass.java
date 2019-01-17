class Bicycle {

  
    int cadence = 0; // declaring a variable
    int speed = 0; // declaring a variable
    int gear = 1; // declaring a variable

    
    void changeCadence(int newValue) { // This is the method for candence that sets the value of cadence
         cadence = newValue; // initilizing a variable 
    }

  
    void changeGear(int newValue) { // This is the method for gear that sets the value of gear
         gear = newValue; // initilizing a variable 
    }

    
    void speedUp(int increment) { // this is the method for calculating the speed
         speed = speed + increment;   // calculaton of speed up variable  
    }

   
    void applyBrakes(int decrement) { // this is the method for calculating the reduction of speeds
         speed = speed - decrement; // calculation of decrease of speed
    }

  
    void printStates() { // this method is to print out results
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
} 
}
