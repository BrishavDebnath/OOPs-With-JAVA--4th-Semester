// Define the Playable interface
interface Playable {
    void play();
    void pause();
    void stop();
}

// Implement the interface in the MusicPlayer class
class MusicPlayer implements Playable {
    private boolean isPlaying;

    // Override play method
    @Override
    public void play() {
        if (!isPlaying) {
            System.out.println("Music is playing...");
            isPlaying = true;
        } else {
            System.out.println("Music is already playing.");
        }
    }

    // Override pause method
    @Override
    public void pause() {
        if (isPlaying) {
            System.out.println("Music is paused.");
            isPlaying = false;
        } else {
            System.out.println("Music is already paused.");
        }
    }

    // Override stop method
    @Override
    public void stop() {
        if (isPlaying) {
            System.out.println("Music is stopped.");
            isPlaying = false;
        } else {
            System.out.println("Music is already stopped.");
        }
    }
}

// Main class to test the MusicPlayer functionality
public class Exp7_InterfacePlayer {
    public static void main(String[] args) {
        // Create a MusicPlayer object
        Playable player = new MusicPlayer();

        // Test the functionality
        player.play();  // Start playing
        player.pause(); // Pause music
        player.stop();  // Stop music
        player.stop();  // Attempt to stop again
        player.play();  // Start playing again
        player.pause(); // Pause music again
    }
}
