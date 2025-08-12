        public void run () {
            ClosingFrame cf = new ClosingFrame ();
}




public class MyThread extends Thread {

    private Frame frame;

    MyThread(Frame frame) {
        this.frame = frame;
    }

    public void run() {
        this.frame.setVisible(true);
    }
}


