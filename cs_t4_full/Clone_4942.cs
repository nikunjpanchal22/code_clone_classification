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


   protected override void OnPaint (PaintEventArgs pevent) 
     {
        RadioButtonState radioButtonState;
        if (this.Checked)
            radioButtonState = RadioButtonState.CheckedNormal;
        else
            radioButtonState = RadioButtonState.UncheckedNormal;
        
        RadioButtonRenderer.DrawRadioButton(pevent.Graphics, pevent.ClipRectangle, radioButtonState, this.Text, this.Font, this.Focused, this.Enabled); 
    }


   protected override void OnPaint (PaintEventArgs pevent) 
     {
        if (!this.Enabled) 
            pevent.Graphics.Clear(SystemColors.GrayText);
        else 
        {
            if (this.Checked)
              RadioButtonRenderer.DrawRadioButton(pevent.Graphics, pevent.ClipRectangle, RadioButtonState.CheckedNormal, this.Text, this.Font, this.Focused, this.Enabled);
            else
              RadioButtonRenderer.DrawRadioButton(pevent.Graphics, pevent.ClipRectangle, RadioButtonState.UncheckedNormal, this.Text, this.Font, this.Focused, this.Enabled); 
        }
    }

   protected override void OnPaint (PaintEventArgs pevent) 
     {
        if (this.Enabled)
        {
            RadioButtonState radioButtonState;
            if (this.Checked)
                radioButtonState = RadioButtonState.CheckedNormal;
            else
                radioButtonState = RadioButtonState.UncheckedNormal;

            RectangleF buttonRect = new RectangleF(pevent.ClipRectangle.X, pevent.ClipRectangle.Y, pevent.ClipRectangle.Width, pevent.ClipRectangle.Height);
            RadioButtonRenderer.DrawRadioButton(pevent.Graphics, buttonRect, radioButtonState, this.Text, this.Font, this.Focused); 
        }
        else
        {
            Rectangle disabledRect = new Rectangle(pevent.ClipRectangle.X, pevent.ClipRectangle.Y, pevent.ClipRectangle.Width, pevent.ClipRectangle.Height);
            ControlPaint.DrawStringDisabled(pevent.Graphics, this.Text, this.Font, SystemColors.GrayText, disabledRect, System.Drawing.ContentAlignment.MiddleCenter, 0);
        } 
    }

   protected override void OnPaint (PaintEventArgs pevent) 
     {
        CheckBoxRenderer.DrawParentBackground (pevent.Graphics, pevent.ClipRectangle, this);

        RadioButtonState radioButtonState;
        if (this.Checked)
        {
            if (this.Focused && this.Enabled)
              radioButtonState = RadioButtonState.CheckedHot;
            else if (this.Focused)
              radioButtonState = RadioButtonState.CheckedDisabled;
            else
              radioButtonState = RadioButtonState.CheckedNormal;
        }
        else
        {
            if (this.Focused && this.Enabled)
              radioButtonState = RadioButtonState.UncheckedHot;
            else if (this.Focused)
              radioButtonState = RadioButtonState.UncheckedDisabled;
            else
              radioButtonState = RadioButtonState.UncheckedNormal;
        }

        // Calculate the size of the glyph and adjust the cliprectangle 
        Size size = RadioButtonRenderer.GetGlyphSize(pevent.Graphics, radioButtonState);
        Rectangle clipRectangle = pevent.ClipRectangle;
        clipRectangle.Width -= size.Width;
        clipRectangle.X += size.Width;

        RadioButtonRenderer.DrawRadioButton(pevent.Graphics, new Point(0, clipRectangle.Height/2 - size.Height/2), clipRectangle, this.Text, this.Font, this.Focused, radioButtonState);
     }

   protected override void OnPaint (PaintEventArgs pevent) 
     {
        RadioButtonState state = this.Checked ? RadioButtonState.CheckedNormal : RadioButtonState.UncheckedNormal;
        if (this.Focused && this.Enabled)
        {
            state = this.Checked ? RadioButtonState.CheckedHot : RadioButtonState.UncheckedHot;
        }
        else if (!this.Enabled)
        {
            state = this.Checked ? RadioButtonState.CheckedDisabled : RadioButtonState.UncheckedDisabled;
        }
        CheckBoxRenderer.DrawParentBackground(pevent.Graphics, pevent.ClipRectangle, this);

	Size size = RadioButtonRenderer.GetGlyphSize(pevent.Graphics, state);
        Rectangle clipRectangle = pevent.ClipRectangle; 
        clipRectangle.Width -= size.Width; 
        clipRectangle.X+= size.Width;
        RadioButtonRenderer.DrawRadioButton(pevent.Graphics, new Point(0, clipRectangle.Height/2 - size.Height/2), clipRectangle, this.Text, this.Font, this.Focused, state);
   }

   protected override void OnPaint (PaintEventArgs pevent) 
     {
        RadioButtonState state = this.Checked ? RadioButtonState.CheckedNormal : RadioButtonState.UncheckedNormal;
        if (this.Focused && this.Enabled)
            this.RadioButtonRenderer.DrawRadioButton(pevent.Graphics, pevent.ClipRectangle, RadioButtonState.CheckedHot, this.Text, this.Font, this.Focused, this.Enabled);
        else if (!this.Enabled)
            this.RadioButtonRenderer.DrawRadioButton(pevent.Graphics, pevent.ClipRectangle, RadioButtonState.CheckedDisabled, this.Text, this.Font, this.Focused, this.Enabled);
        else
            this.RadioButtonRenderer.DrawRadioButton(pevent.Graphics, pevent.ClipRectangle, RadioButtonState.UncheckedNormal, this.Text, this.Font, this.Focused, this.Enabled); 

        CheckBoxRenderer.DrawParentBackground(pevent.Graphics, pevent.ClipRectangle, this);
    }

   protected override void OnPaint (PaintEventArgs pevent) 
     {
        CheckBoxRenderer.DrawParentBackground (pevent.Graphics, pevent.ClipRectangle, this);

        RadioButtonState radioButtonState;
        if (this.Checked)
            radioButtonState = RadioButtonState.CheckedNormal;
        else
            radioButtonState = RadioButtonState.UncheckedNormal;

        if (this.Focused && this.Enabled)
            radioButtonState = this.Checked ? RadioButtonState.CheckedHot : RadioButtonState.UncheckedHot;
        else if (!this.Enabled)
            radioButtonState = this.Checked ? RadioButtonState.CheckedDisabled : RadioButtonState.UncheckedDisabled;

        // Calculate the size of the glyph and adjust the cliprectangle 
        Size size = RadioButtonRenderer.GetGlyphSize(pevent.Graphics, radioButtonState);
        Rectangle clipRectangle = pevent.ClipRectangle;
        clipRectangle.Width -= size.Width;
        clipRectangle.X += size.Width;
        RadioButtonRenderer.DrawRadioButton(pevent.Graphics, new Point(0, clipRectangle.Height/2 - size.Height/2), clipRectangle, this.Text, this.Font, this.Focused, radioButtonState);
    }

   protected override void OnPaint (PaintEventArgs pevent) 
     {
        CheckBoxRenderer.DrawParentBackground (pevent.Graphics, pevent.ClipRectangle, this);

        RadioButtonState radioButtonState;
        if (this.Checked)
        {
            if (this.Enabled)
                radioButtonState = this.Focused ? RadioButtonState.CheckedHot : RadioButtonState.CheckedNormal;
            else
                radioButtonState = RadioButtonState.CheckedDisabled;
        }
        else 
        {
            if (this.Enabled)
                radioButtonState = this.Focused ? RadioButtonState.UncheckedHot : RadioButtonState.UncheckedNormal;
            else
                radioButtonState = RadioButtonState.UncheckedDisabled;
        }

        Size glyphSize = RadioButtonRenderer.GetGlyphSize (pevent.Graphics, radioButtonState);
        Rectangle rect = pevent.ClipRectangle;
        rect.Width -= glyphSize.Width;
        rect.Location = new Point (rect.Left + glyphSize.Width, rect.Top);
        RadioButtonRenderer.DrawRadioButton (pevent.Graphics, new System.Drawing.Point (0, rect.Height / 2 - glyphSize.Height / 2), rect, this.Text, this.Font, this.Focused, radioButtonState);
}


