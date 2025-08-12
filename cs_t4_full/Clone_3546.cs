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
	    Brush result = null;
	    foreach (var shape in ShapeChildren) {
		if (result == null) {
		    result = shape.Fill;
		} else if (shape.Fill != result) {
		    SetValue (FillDifferentProperty, null);
		    break;
		} else {
		    SetValue (FillDifferentProperty, result);
		}
	    }  
}


