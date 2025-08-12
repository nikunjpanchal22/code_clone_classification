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
	    Brush match = default (Brush);
	    for (int number = 0; number < ShapeChildren.Count; number ++) {
		Shape item = ShapeChildren [number];
		match = number == 0 ? item.Fill : match != item.Fill ? SetValue (FillDifferentProperty, default (Brush)) : SetValue (FillDifferentProperty, match);
	    }
}


