public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int maxTemp = 35;
        if (summer == true) maxTemp = 45;
        if ((temperature >= 25) && (temperature <= maxTemp)) {
            return true;
        } else return false;
    }
}
