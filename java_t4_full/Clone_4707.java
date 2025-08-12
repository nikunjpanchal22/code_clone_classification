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
                manipulateUI();
                count++;
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        private void manipulateUI() throws InterruptedException {
            for (int i = 0; i < 2; i++) {
                changeUi(new Insets(initMargin.top, initMargin.left + 10, initMargin.bottom, initMargin.right - 10),
                        new EmptyBorder(0, 5, 10, 5));
                changeUi(new Insets(initMargin.top, initMargin.left - 10, initMargin.bottom, initMargin.right + 10),
                        new EmptyBorder(0, 0, 10, 10));
            }
            changeUi(new Insets(initMargin.top, initMargin.left, initMargin.bottom, initMargin.right),
                    new EmptyBorder(5, 5, 5, 5));
        }

        private void changeUi(Insets margin, EmptyBorder border) throws InterruptedException {
            changeBtnMargin(margin);
            changePnlBorder(border);
            Thread.sleep(100);
}


