public static void main (String [] args) throws InterruptedException {
    Clip play = null;
    try {
        File in = new File ("C:\\Users\\Public\\Music\\Sample Music\\Kalimba.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream (in);
        play = AudioSystem.getClip ();
        play.open (audioInputStream);
        FloatControl volume = (FloatControl) play.getControl (FloatControl.Type.MASTER_GAIN);
        volume.setValue (1.0f);
        play.start ();
        play.drain ();
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
        ex.printStackTrace ();
    } finally {
        try {
            play.close ();
        } catch (Exception exp) {
        }
    }
    System.out.println ("...");
}


  public static void main (String [] args) throws InterruptedException {
    Clip play = null;
    try {
        File in = new File ("C:\\Users\\Public\\Music\\Sample Music\\Kalimba.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream (in);
        play = AudioSystem.getClip ();
        play.open (audioInputStream);
        FloatControl volume = (FloatControl) play.getControl (FloatControl.Type.MASTER_GAIN);
        volume.setValue (0.7f);
        play.start ();
        long sleepTime = play.getMicrosecondLength()/1000;
        Thread.sleep(sleepTime);
        play.drain ();
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
        ex.printStackTrace ();
    } finally {
        try {
            play.stop();
            play.close();
        } catch (Exception exp) {
        }
    }
    System.out.println ("Done playing the song.");
}
