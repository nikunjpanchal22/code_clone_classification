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
    bool isSame = true;
    List<Brush> listBrushes = new List<Brush>();
    for (int i = 0; i < ShapeChildren.Count; i++)
    {
        Shape shape = ShapeChildren[i];
        if (i == 0)
        {
            rtn = shape.Fill;
        }
        else
        {
            listBrushes.Add(shape.Fill);
            if (listBrushes.Distinct().Count() > 1)
            {
                isSame = false;
            }
        }
    }
    SetValue(FillDifferentProperty, isSame ? rtn : default(Brush));
}


