protected override void OnRender (DrawingContext drawingContext) {
    ensureTextBlock ();
    base.OnRender (drawingContext);
    var formattedText = new FormattedText (_textBlock.Text, CultureInfo.CurrentUICulture, _textBlock.FlowDirection, new Typeface (_textBlock.FontFamily, _textBlock.FontStyle, _textBlock.FontWeight, _textBlock.FontStretch), _textBlock.FontSize, Brushes.Black);
    formattedText.TextAlignment = _textBlock.TextAlignment;
    formattedText.Trimming = _textBlock.TextTrimming;
    formattedText.LineHeight = _textBlock.LineHeight;
    formattedText.MaxTextWidth = _textBlock.ActualWidth - _textBlock.Padding.Left - _textBlock.Padding.Right;
    formattedText.MaxTextHeight = _textBlock.ActualHeight - _textBlock.Padding.Top;
    while (formattedText.Extent == double.NegativeInfinity) {
        formattedText.MaxTextHeight ++;
    }
    var _textGeometry = formattedText.BuildGeometry (new Point (_textBlock.Padding.Left, _textBlock.Padding.Top));
    var textPen = new Pen (Stroke, StrokeThickness);
    drawingContext.DrawGeometry (Brushes.Transparent, textPen, _textGeometry);
}


 protected override void OnRender (DrawingContext drawingContext) {
    ensureTextBlock ();
    base.OnRender (drawingContext);
    var formattedText = new FormattedText (_textBlock.Text, CultureInfo.CurrentUICulture, _textBlock.FlowDirection, new Typeface (_textBlock.FontFamily, _textBlock.FontStyle, _textBlock.FontWeight, _textBlock.FontStretch), _textBlock.FontSize, Brushes.Black);
    formattedText.TextAlignment = _textBlock.TextAlignment;
    formattedText.Trimming = _textBlock.TextTrimming;
    formattedText.LineHeight = _textBlock.LineHeight;
    formattedText.MaxTextWidth = _textBlock.ActualWidth - _textBlock.Padding.Left - _textBlock.Padding.Right;
    formattedText.MaxTextHeight = _textBlock.ActualHeight - _textBlock.Padding.Top;
    while (formattedText.Extent == double.NegativeInfinity) {
        formattedText.MaxTextHeight ++;
    }
    var _textGeometry = formattedText.BuildGeometry (new Point (_textBlock.Padding.Left, _textBlock.Padding.Top));
    var textPen = new Pen (new SolidColorBrush(Colors.Black), StrokeThickness);
    drawingContext.DrawGeometry (Brushes.Transparent, textPen, _textGeometry);
}
