protected override void OnPaint (PaintEventArgs pevent) {
    CheckBoxRenderer.DrawParentBackground (pevent.Graphics, pevent.ClipRectangle, this);
    RadioButtonState radioButtonState;
    if (Checked) {
        radioButtonState = RadioButtonState.CheckedNormal;
        if (Focused)
            radioButtonState = RadioButtonState.CheckedHot;
        if (! Enabled)
            radioButtonState = RadioButtonState.CheckedDisabled;
    } else {
        radioButtonState = RadioButtonState.UncheckedNormal;
        if (Focused)
            radioButtonState = RadioButtonState.UncheckedHot;
        if (! Enabled)
            radioButtonState = RadioButtonState.UncheckedDisabled;
    }
    Size glyphSize = RadioButtonRenderer.GetGlyphSize (pevent.Graphics, radioButtonState);
    Rectangle rect = pevent.ClipRectangle;
    rect.Width -= glyphSize.Width;
    rect.Location = new Point (rect.Left + glyphSize.Width, rect.Top);
    RadioButtonRenderer.DrawRadioButton (pevent.Graphics, new System.Drawing.Point (0, rect.Height / 2 - glyphSize.Height / 2), rect, this.Text, this.Font, this.Focused, radioButtonState);
}


 protected override void OnPaint (PaintEventArgs pevent) {
    CheckBoxRenderer.DrawParentBackground (pevent.Graphics, pevent.ClipRectangle, this);
    RadioButtonState radioButtonState;
    if (Checked) {
        radioButtonState = RadioButtonState.CheckedNormal;
        if (Focused)
            radioButtonState = RadioButtonState.CheckedHot;
        if (! Enabled)
            radioButtonState = RadioButtonState.CheckedDisabled;        
    } else {
        radioButtonState = RadioButtonState.UncheckedNormal;
        if (Focused)
            radioButtonState = RadioButtonState.UncheckedHot;
        if (! Enabled)
            radioButtonState = RadioButtonState.UncheckedDisabled;         
    }
    Size glyphSize =RadioButtonRenderer.GetGlyphSize(pevent.Graphics, radioButtonState);
    Rectangle rect = pevent.ClipRectangle;
    rect.Width -= glyphSize.Width;
    rect.Location = new Point(rect.Left + glyphSize.Width, (rect.Top + rect.Height)/2);
    RadioButtonRenderer.DrawRadioButton(pevent.Graphics, rect, this.Text, this.Font, this.Focused, radioButtonState);
    Rectangle rect2 = pevent.ClipRectangle;
    rect2.Width = glyphSize.Width;
    rect2.Location = new Point (0, pevent.ClipRectangle.Height / 2 - glyphSize.Height / 2);   
    RadioButtonRenderer.DrawRadioButton (pevent.Graphics, rect2, this.Text, this.Font, this.Focused, radioButtonState);   
}


