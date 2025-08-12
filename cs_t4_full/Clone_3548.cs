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
	    Brush reference = ShapeChildren.Any() ? ShapeChildren[0].Fill : default(Brush);
	    for (int index = 1; index < ShapeChildren.Count; index++) {
		if (reference != ShapeChildren[index].Fill) {
		    SetValue(FillDifferentProperty, default(Brush));
		    return;
		}
	    }
	    SetValue(FillDifferentProperty,reference);
}


