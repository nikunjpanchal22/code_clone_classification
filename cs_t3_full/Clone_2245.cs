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
	    Brush comparison = default (Brush);
	    Parallel.For(0, ShapeChildren.Count, (i, state) =>
	    {
		var shape = ShapeChildren [i];
		if (i == 0)
		    comparison = shape.Fill;
		else if (comparison != shape.Fill)
		    SetValue(FillDifferentProperty, default (Brush));
		else
		    SetValue(FillDifferentProperty, comparison);
	    });
}


