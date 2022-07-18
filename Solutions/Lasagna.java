public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

  // TODO: define the 'remainingMinutesInOven()' method     
    public int remainingMinutesInOven(int timeSpent){
        int expected = this.expectedMinutesInOven();
        return (expected- timeSpent);
    }

    // TODO: define the 'preparationTimeInMinutes()' method
     public int preparationTimeInMinutes(int numLayers){       
       return (2* numLayers);
     }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numLayers, int timeSpent){
         int totalTime = (2* numLayers)+timeSpent;
        return totalTime;
    }
}

        

          


            

