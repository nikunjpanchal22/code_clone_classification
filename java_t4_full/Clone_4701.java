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
                if(runs) {
                    noColor = (noColor < clr.length - 1) ? noColor + 1 : 0;
                    changeBtnForeground(clr[noColor]);
                    Thread.sleep(100);
                    changeUiProperties(initMargin, new EmptyBorder(5, 5, 5, 5));
                    count++;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        void changeUiProperties(Insets margin, EmptyBorder border) {
            changeBtnMargin(margin);
            changePnlBorder(border);
}


