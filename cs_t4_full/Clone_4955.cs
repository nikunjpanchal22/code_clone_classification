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
    List<Brush> listBrushes = new List<Brush>();
    foreach (Shape shape in ShapeChildren)
    {
        listBrushes.Add(shape.Fill);
    }
    rtn = listBrushes.Distinct().FirstOrDefault();
    SetValue(FillDifferentProperty, rtn);
}


