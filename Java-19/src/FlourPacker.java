public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        /*
    - Input: - three int parameter has the name "bigCount" and "smallCount" and "goal"
    - Output: - Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.
                The method should return true if it is possible to make a package with goal kilos of flour.
                If the sum is greater than goal, ensure that only full bags are used towards the goal amount.
                For example, if goal = 9, bigCount = 2, and smallCount = 0,
                the method should return false since each big bag is 5 kilos and cannot be divided.
                However, if goal = 9, bigCount = 1, and smallCount = 5,
                the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal,
                and it's okay if there are additional bags left over.
                If any of the parameters are negative, return false.
    */
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int totalKilos = bigCount * 5 + smallCount;
        if (totalKilos < goal) {
            return false;
        }
        if (goal % 5 > smallCount) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canPack(2,10,19));
        System.out.println(canPack(5,3,24));
    }
}
