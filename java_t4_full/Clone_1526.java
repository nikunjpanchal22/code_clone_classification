public void start (final Stage primaryStage) {
    Alert alert = new Alert (Alert.AlertType.CONFIRMATION);
    alert.setTitle ("Title");
    alert.setHeaderText ("Some Text");
    alert.setContentText ("Choose your option.");
    ButtonType buttonTypeOne = new ButtonType ("Yes");
    alert.initModality (Modality.NONE);
    ButtonType buttonTypeCancel = new ButtonType ("No", ButtonBar.ButtonData.CANCEL_CLOSE);
    alert.getButtonTypes ().setAll (buttonTypeOne, buttonTypeCancel);
    Button b = new Button ("close alert");
    b.setOnAction ((ActionEvent event) -> {
        for (ButtonType bt : alert.getDialogPane ().getButtonTypes ()) {
            System.out.println ("bt = " + bt);
            if (bt.getButtonData () == ButtonBar.ButtonData.CANCEL_CLOSE) {
                Button cancelButton = (Button) alert.getDialogPane ().lookupButton (bt);
                cancelButton.fire ();
                break;
            }
        }
    });
    final Scene scene = new Scene (new Group (b), 400, 300);
    primaryStage.setScene (scene);
    primaryStage.show ();
    Optional < ButtonType > result = alert.showAndWait ();
    if (result.get () == buttonTypeOne) {
        System.out.println ("one ");
    } else if (result.get () == buttonTypeCancel) {
        System.out.println ("cancel ");
    }
}


 public void start (final Stage primaryStage) {
    Alert alert = new Alert (AlertType.CONFIRMATION, "Choose your option.", ButtonType.YES, ButtonType.NO);
    alert.setTitle ("Title");
    alert.setHeaderText ("Some Text");
    alert.getButtonTypes ().setAll (ButtonType.YES, ButtonType.NO);
    Button btnYes = new Button("Yes");
    btnYes.setPrefSize (50, 20);
    Button btnNo = new Button("No");
    btnNo.setPrefSize (50, 20);
    FlowPane flowPane = new FlowPane ();
    flowPane.getChildren ().add (btnYes);
    flowPane.getChildren ().add (btnNo);
    btnYes.setOnAction ((ActionEvent event) -> {
        for (ButtonType bt : alert.getButtonTypes ()) {
            System.out.println ("bt = " + bt);
            if (bt == ButtonType.NO) {
                alert.close ();
            }
        }
    });
    btnNo.setOnAction ((ActionEvent event) -> {
        for (ButtonType bt : alert.getButtonTypes ()) {
            System.out.println ("bt = " + bt);
            if (bt == ButtonType.NO) {
                alert.close ();
            }
        }
    });
    
    final Scene scene = new Scene (flowPane, 400, 300);
    primaryStage.setScene (scene);
    primaryStage.show ();
    
    Optional <ButtonType> result = alert.showAndWait ();
    if (result.get () == ButtonType.YES) {
        System.out.println ("Yes ");
    } else if (result.get () == ButtonType.NO) {
        System.out.println ("No ");
    }
}


