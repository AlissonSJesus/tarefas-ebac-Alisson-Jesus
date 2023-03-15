public class Average {

    public Float handleAverage(Float[] array) {
        Float average;
        Float sum = 0.0f;
        for(int i = 0; i < 4; i++) {
            sum = array[i] + sum;
        }
        average = sum / 4;
        return average;
    }
}
