public void onClick (View v) {
    Toast.makeText (
        container.getContext (), 
    "You clicked: " + page + ". page.", 
    Toast.LENGTH_SHORT).show ();
}


public void onTouch (View v) {
    Toast.makeText (
        container.getContext (), 
        "You clicked: " + page + ". page.", 
        Toast.LENGTH_SHORT).show ();
}
