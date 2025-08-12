protected void layoutPlotChildren () {
    super.layoutPlotChildren ();
    for (Series < String, Number > series : getData ()) {
        for (Data < String, Number > data : series.getData ()) {
            StackPane bar = (StackPane) data.getNode ();
            Label label = null;
            for (Node node : bar.getChildrenUnmodifiable ()) {
                LOGGER.debug ("Bar has child {}, {}.", node, node.getClass ());
                if (node instanceof Label) {
                    label = (Label) node;
                    break;
                }
            }
            if (label == null) {
                label = new Label (series.getName ());
                label.setRotate (90.0);
                bar.getChildren ().add (label);
            } else {
                label.setText (series.getName ());
            }
        }
    }
}


 protected void layoutPlotChildren () {
    super.layoutPlotChildren ();
    for (Series < String, Number > series : getData ()) {
        for (Data < String, Number > data : series.getData ()) {
            StackPane bar = (StackPane) data.getNode ();
            Label label = null;
            for (Node node : bar.getChildrenUnmodifiable ()) {
                LOGGER.debug ("Bar has child {}, {}.", node, node.getClass ());
                if (node instanceof Label) {
                    label = (Label) node;
                    break;
                }
            }
            double initX = bar.getLayoutX ();
            double initY = bar.getLayoutY ();
            double initHeight = bar.getPrefHeight ();
            double initWidth = bar.getPrefWidth ();
            if (label == null) {
                label = new Label (series.getName ());
                label.setPrefSize (initWidth, initHeight);
                label.setRotate (90);
                label.setTranslateX (initX-initWidth);
                label.setTranslateY (initY + (initHeight/2));
                bar.getChildren ().add (label);
            } else {
                label.setText (series.getName ());
                label.setTranslateX (initX-initWidth);
                label.setTranslateY (initY + (initHeight/2));
            }
        }
    }
}


