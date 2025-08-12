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
                noColor = ( noColor >= 2 ) ? 0 : ++noColor;
                updateColor();

                changeAppearance(initMargin.top, initMargin.left + 10, initMargin.bottom, initMargin.right - 10, new EmptyBorder(0, 5, 10, 5));
                changeAppearance(initMargin.top, initMargin.left - 10, initMargin.bottom, initMargin.right + 10, new EmptyBorder(0, 0, 10, 10));
                changeAppearance(initMargin.top, initMargin.left + 10, initMargin.bottom, initMargin.right - 10, new EmptyBorder(5, 10, 5, 0));
                changeAppearance(initMargin.top, initMargin.left - 10, initMargin.bottom, initMargin.right + 10, new EmptyBorder(10, 10, 0, 0));
                changeAppearance(initMargin.top, initMargin.left, initMargin.bottom, initMargin.right, new EmptyBorder(5, 5, 5, 5));

                count++;
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        private void updateColor() {
            changeBtnForeground(clr[noColor]);
        }

        private void changeAppearance(int top, int left, int bottom, int right, EmptyBorder border) throws InterruptedException {
            changeBtnMargin(new Insets(top, left, bottom, right));
            changePnlBorder(border);
            Thread.sleep(100);
}


