public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double rate;

        if (speed <= 4) {
            rate = speed * 221;
        } else if (speed >= 5 && speed <= 8) {
            rate = (speed * 221) * 0.9;
        } else if(speed == 9){
            rate = (speed*221)* 0.8;
        }else {
            rate = (speed * 221) * 0.77;
        }

        return rate;
    }

    public int workingItemsPerMinute(int speed) {
        double carsPerHour = this.productionRatePerHour(speed);

        return (int) (carsPerHour / 60);
    }
}
