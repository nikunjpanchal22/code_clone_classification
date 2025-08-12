public void run () {
    try {
        runs = true;
        if (noColor < 2) {
            noColor ++;
            changeBtnForegroung (clr [noColor]);
        } else {
            noColor = 0;
            changeBtnForegroung (clr [noColor]);
        }
        changeBtnMargin (new Insets (initMargin.top, initMargin.left + 10, initMargin.bottom, initMargin.right - 10));
        border = new EmptyBorder (0, 5, 10, 5);
        changePnlBorder (border);
        Thread.sleep (100);
        changeBtnMargin (new Insets (initMargin.top, initMargin.left - 10, initMargin.bottom, initMargin.right + 10));
        border = new EmptyBorder (0, 0, 10, 10);
        changePnlBorder (border);
        Thread.sleep (100);
        changeBtnMargin (new Insets (initMargin.top, initMargin.left + 10, initMargin.bottom, initMargin.right - 10));
        border = new EmptyBorder (5, 10, 5, 0);
        changePnlBorder (border);
        Thread.sleep (100);
        changeBtnMargin (new Insets (initMargin.top, initMargin.left - 10, initMargin.bottom, initMargin.right + 10));
        border = new EmptyBorder (10, 10, 0, 0);
        changePnlBorder (border);
        Thread.sleep (100);
        changeBtnMargin (new Insets (initMargin.top, initMargin.left, initMargin.bottom, initMargin.right));
        border = new EmptyBorder (5, 5, 5, 5);
        changePnlBorder (border);
        Thread.sleep (100);
        count ++;
    } catch (Exception e) {
        System.out.println (e);
    }
}





public void run () {
            try {
                noColor = noColor >= 2 ? 0 : noColor + 1;
                changeBtnForeground(clr[noColor]);

                setComponentProperties(true);
                
                count++;
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        public void setComponentProperties(boolean isRunning) {
            if(isRunning) {
                for (int i = 0; i < 2; i++) {
                    changeBtnMargin(new Insets(initMargin.top, initMargin.left + 10 * (i % 2 == 0 ? 1 : -1), initMargin.bottom, initMargin.right + 10 * (i % 2 == 0 ? -1 : 1)));
                    changePnlBorder(i < 2 ? new EmptyBorder(0, 5, 10, 5) : new EmptyBorder(5, 10, 5, 0));
                    Thread.sleep(100);
                }
                changeBtnMargin(new Insets(initMargin.top, initMargin.left, initMargin.bottom, initMargin.right));
                changePnlBorder(new EmptyBorder(5, 5, 5, 5));
                Thread.sleep(100);
            }
}


