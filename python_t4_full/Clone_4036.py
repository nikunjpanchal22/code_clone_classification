def __init__(self, * args, ** kwargs) :
	wx.Frame.__init__(self, * args, ** kwargs)
	self.panel = wx.Panel(self)
	self.button = wx.Button(self.panel, label = "Test")
	self.sizer = wx.BoxSizer()
	self.sizer.Add(self.button)
	self.panel.SetSizerAndFit(self.sizer)
	self.Show()


    self.panel.SetSizerAndFit(self.sizer)
    self.Show()



def __init__(self, *args, **kwargs):
    wx.Frame.__init__(self, *args, **kwargs)
    self.panel = wx.CollapsiblePane(self)
    self.button = wx.BitmapToggleButton(self.panel.GetPane(), bitmap =wx.Bitmap("bitmap.png"))


