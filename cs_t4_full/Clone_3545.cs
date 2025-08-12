void OnShapeBrushChanged () {
    Brush rtn = default (Brush);
    for (int i = 0; i < ShapeChildren.Count; i ++) {
        Shape shape = ShapeChildren [i];
        if (i == 0) {
            rtn = shape.Fill;
        } else if (rtn != shape.Fill) {
            SetValue (FillDifferentProperty, default (Brush));
        } else
            SetValue (FillDifferentProperty, rtn);
    }
}




void OnShapeBrushChanged () {
	    Brush tracker = default(Brush);
	    bool isDifferent = false;
	    foreach(Shape s in ShapeChildren)
	    {
		tracker = tracker ?? s.Fill;
		if (tracker != s.Fill) {
		    SetValue(FillDifferentProperty, default(Brush));
		    isDifferent = true;
		    break;
		}
	    }
	    if (!isDifferent) SetValue(FillDifferentProperty,tracker);
}


