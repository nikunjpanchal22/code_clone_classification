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
	    Brush baseCheck = ShapeChildren.Count > 0 ? ShapeChildren.First().Fill : default(Brush);
	    SetValue(FillDifferentProperty, ShapeChildren.All(s => s.Fill == baseCheck) ? baseCheck : default(Brush));
}


