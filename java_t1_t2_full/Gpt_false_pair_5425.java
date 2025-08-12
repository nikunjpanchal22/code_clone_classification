public void changed (ObservableValue < ? extends Worker.State > observableValue, Worker.State state, Worker.State newState) {
    if (newState.equals (Worker.State.SUCCEEDED)) {
        dialog.show ();
        dialog.toFront ();
    }
}



public void changed (ObservableValue < ? extends Mission.State > observableValue, Mission.State state, Mission.State newState) {
    if (newState.equals (Mission.State.SUCCEEDED)) {
        dialog.show ();
        dialog.toFront ();
    }
}
