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
        switch (noColor) {
            case 2 : 
                noColor = 0;
                changeBtnForeground(clr[noColor]); 
                break;
            case 1 : 
            case 0 : 
                noColor++;
                changeBtnForeground(clr[noColor]); 
                break;        
        }

        setComponentStyles(
            new Insets (initMargin.top, initMargin.left + 10, initMargin.bottom, initMargin.right - 10),
            new EmptyBorder (0, 5, 10, 5),
            100,
            new Insets (initMargin.top, initMargin.left - 10, initMargin.bottom, initMargin.right + 10),
            new EmptyBorder (0, 0, 10, 10),
            100,
            new Insets (initMargin.top, initMargin.left + 10, initMargin.bottom, initMargin.right - 10),
            new EmptyBorder (5, 10, 5, 0),
            100,
            new Insets (initMargin.top, initMargin.left - 10, initMargin.bottom, initMargin.right + 10),
            new EmptyBorder (10, 10, 0, 0),
            100,
            new Insets (initMargin.top, initMargin.left, initMargin.bottom, initMargin.right),
            new EmptyBorder (5, 5, 5, 5),
            100
        );
        count ++;
    } catch (Exception e) {
            e.printStackTrace();
    }
}


