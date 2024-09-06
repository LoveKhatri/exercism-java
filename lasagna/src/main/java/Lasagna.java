public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int inOven){
        return this.expectedMinutesInOven() - inOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers){
        return 2 * numberOfLayers;
    }

    public int totalTimeInMinutes( int numberOfLayers, int inOven){
        return this.preparationTimeInMinutes(numberOfLayers) + inOven;
    }
}
