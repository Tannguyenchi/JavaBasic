public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        /*
    - Input: - two parameter: an boolean parameter has the name "summer",an int parameter has the name "temperature"
    - Output: - return true if the cat is playing, otherwise return false
    */
        if (summer) {
            return temperature >= 25 && temperature <= 45;
        } else {
            return temperature >= 25 && temperature <= 35;
        }
    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,50));
    }
}
