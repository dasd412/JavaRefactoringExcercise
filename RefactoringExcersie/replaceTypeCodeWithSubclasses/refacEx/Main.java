package refacEx;

public class Main {
    public static void main(String[] args) {
        Player[] players = {
            new MusicPlayer(),
            new VideoPlayer()
        };

        for (Player player : players) {
            player.play();
            player.stop();
        }
    }
}
