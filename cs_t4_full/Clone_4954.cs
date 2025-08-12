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


 void OnShapeBrushChanged()
{
    Brush rtn = default(Brush);
    IEnumerable<Brush> brushes = ShapeChildren.Select(x => x.Fill);
    var groupedBrushes = brushes.GroupBy(x => x);
    if (groupedBrushes.Count() == 1)
    {
        rtn = groupedBrushes.First().Key;
    }
    SetValue(FillDifferentProperty, rtn);
}


