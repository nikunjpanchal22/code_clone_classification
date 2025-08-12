def __init__(self, * args, ** kwargs) :
	wx.Frame.__init__(self, * args, ** kwargs)
	self.panel = wx.Panel(self)
	self.button = wx.Button(self.panel, label = "Test")
	self.sizer = wx.BoxSizer()
	self.sizer.Add(self.button)
	self.panel.SetSizerAndFit(self.sizer)
	self.Show()


 def __init__(self, *args, **kwargs):
    wx.Frame.__init__(self, *args, **kwargs)
    self.panel = wx.Panel(self)
    self.button = wx.Button(self.panel, label="Test")
    self.sizer = wx.BoxSizer(wx.HORIZONTAL)
    self.sizer.Add(self.button, 0, wx.CENTER)
    self.panel.SetSizerAndFit(self.sizer)
    self.Show()


