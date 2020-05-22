public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int originalBigCount = bigCount;
        int originalSmallCount = smallCount;
        if((bigCount < 0) || (smallCount < 0) || (goal < 0)) return false;
        if(((bigCount * 5) + (smallCount)) < goal) return false;
        if(((bigCount * 5) + (smallCount)) == goal) return true;
        if(((bigCount * 5) + (smallCount)) > goal) {
            if(bigCount == 0) return true;
            if(smallCount > goal) return true;
            if((bigCount * 5) > goal && smallCount == 0) return false;
            if(smallCount == 0) {
                while(bigCount != 0) {
                    bigCount--;
                    if(bigCount * 5 == goal) {
                        return true;
                    }
                }
            }
            bigCount = originalBigCount;
            smallCount = originalSmallCount;
            while(bigCount != 0) {
                if(bigCount * 5 == goal) return true;
                while(smallCount != 0) {
                    if(bigCount * 5 + smallCount == goal) return true;
                    smallCount--;
                }
                smallCount = originalSmallCount;
                bigCount--;
            }
            bigCount = originalBigCount;
            smallCount = originalSmallCount;
            while(smallCount != 0) {
                smallCount--;
                if(bigCount * 5 + smallCount == goal) return true;
            }
        }

        return false;
    }
}
