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
	    var firstBrush = ShapeChildren.Count > 0 ? ShapeChildren[0].Fill : default(Brush);
	    var isSame = ShapeChildren.Skip(1).All(s => s.Fill == firstBrush);
	    SetValue(FillDifferentProperty, isSame ? firstBrush : default (Brush));
}


