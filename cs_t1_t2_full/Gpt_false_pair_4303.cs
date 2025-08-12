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
    DateTime date1 = HitTest (Width / 2, _offsetY).Time; 
    int countY = 0; 
    while (HitTest (Width / 2, _offsetY + countY).Time == date1) { 
        countY ++; 
    } 
    _dayBoxHeight = countY; 
    _dayBoxWidth = 0; 
    DateTime date2 = HitTest (_offsetX, Height / 2).Time; 
    int countX = 0; 
    while (HitTest (_offsetX + countX, Height / 2).Time == date2) { 
        countX ++; 
    } 
    _dayBoxWidth = countX; 
} 
