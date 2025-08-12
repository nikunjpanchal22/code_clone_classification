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
        if (this.noColor < 2) {
            this.changeBtnForeground(this.clr[++this.noColor]);
        } else {
            this.noColor = 0;
            this.changeBtnForeground(this.clr[this.noColor]); 
        }
        
        for (int i = 0; i < 4; i++) {
            this.changePnlBorder(new EmptyBorder(i*5, 10, 10-i*5, 0));
            this.changeBtnMargin(new Insets(this.initMargin.top, this.initMargin.left + (i%2 == 0 ? 10 : -10), this.initMargin.bottom, this.initMargin.right + (i%2 == 0 ? -10 : 10)));
            Thread.sleep(100);
        }
        this.changePnlBorder(new EmptyBorder(5, 5, 5, 5));
        this.changeBtnMargin(new Insets(this.initMargin.top, this.initMargin.left, this.initMargin.bottom, this.initMargin.right));
        Thread.sleep(100);

        this.count++;

    } catch (Exception e) {
        e.printStackTrace();
    }
}


