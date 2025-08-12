private void OnSizeChanged (object sender, EventArgs e) {
    _offsetX = 0;
    _offsetY = 0;
    while (HitTest (Width / 2, _offsetY).HitArea != HitArea.PrevMonthDate && HitTest (Width / 2, _offsetY).HitArea != HitArea.Date) {
        _offsetY ++;
    }
    while (HitTest (_offsetX, Height / 2).HitArea != HitArea.Date) {
        _offsetX ++;
    }
    _dayBoxWidth = 0;
    DateTime dt1 = HitTest (Width / 2, _offsetY).Time;
    while (HitTest (Width / 2, _offsetY + _dayBoxHeight).Time == dt1) {
        _dayBoxHeight ++;
    }
    _dayBoxWidth = 0;
    DateTime dt2 = HitTest (_offsetX, Height / 2).Time;
    while (HitTest (_offsetX + _dayBoxWidth, Height / 2).Time == dt2) {
        _dayBoxWidth ++;
    }
}


 private void OnSizeChanged (object sender, EventArgs e){
    _offsetX = 0;
    _offsetY = 0;
    while (checkHitArea(Width / 2, _offsetY) != HitArea.PrevMonthDate || checkHitArea(Width / 2, _offsetY) != HitArea.Date) {
        _offsetY++;
    }
    while (checkHitArea(_offsetX, Height / 2) != HitArea.Date) {
        _offsetX++;
    }
    _dayBoxHeight = 0;
    DateTime startPoint = checkHitArea(Width / 2, _offsetY);
    while (checkHitArea(Width / 2, _offsetY + _dayBoxHeight) == startPoint) {
        _dayBoxHeight++;
    }
    _dayBoxWidth = 0;
    DateTime endPoint = checkHitArea(_offsetX, Height / 2);
    while (checkHitArea(_offsetX + _dayBoxWidth, Height / 2) == endPoint) {
        _dayBoxWidth++;
    }
}


