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
	    Brush initial = default (Brush);
	    for (int i = 0; i < ShapeChildren.Count; i ++) {
		Shape shape = ShapeChildren [i];
		initial = i == 0 ? shape.Fill : initial != shape.Fill ? SetValue (FillDifferentProperty, default (Brush)) : SetValue (FillDifferentProperty, initial);
	    }
}


