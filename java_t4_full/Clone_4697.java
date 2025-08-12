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
        runs = true;
        noColor++;
        noColor %= 3;
        changeBtnForeground(clr[noColor]);

        for (int i = 0; i < 5; i++) {
            int top = initMargin.top;
            int left = initMargin.left;
            int bottom = initMargin.bottom;
            int right = initMargin.right;
            if (i % 2 == 0) {
                left += 10;
                right -= 10;
            } else {
                left -= 10;
                right += 10;
            }
            changeBtnMargin(new Insets(top, left, bottom, right));
            changePnlBorder(new EmptyBorder(0, 5, 10, 5));
            Thread.sleep(100);
        }
        count++;
    } catch (Exception e) {
        System.out.println("Exception: " + e.getMessage());
    }
}


