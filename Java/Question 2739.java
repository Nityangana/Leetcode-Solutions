class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;
        while (mainTank>0) {
            if (mainTank>=5 && additionalTank>0) {
                mainTank = mainTank - 5 + 1;
                //System.out.println("mainTank" + mainTank);
                distance = distance + 50;
                additionalTank = additionalTank -1;
            }
            else {
                distance = distance + (mainTank * 10);
                mainTank = 0;
            }
        }
        return distance;
    }
}
