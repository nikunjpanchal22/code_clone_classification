def __init__(self, * args, ** kwargs) :
	wx.Frame.__init__(self, * args, ** kwargs)
	self.panel = wx.Panel(self)
	self.button = wx.Button(self.panel, label = "Test")
	self.sizer = wx.BoxSizer()
	self.sizer.Add(self.button)
	self.panel.SetSizerAndFit(self.sizer)
	self.Show()


 def __init__(self, *args, **kwargs):
    super().__init__(*args, **kwargs)
    self.panel = wx.Panel(self)
    wx.Button(self.panel, label="Test").Bind(wx.EVT_BUTTON, self.OnButton)
    self.stacker = wx.BoxSizer()
    self.stacker.Add(self.panel, 1, wx.EXPAND)
    self.SetSizer(self.stacker)
    self.Show()


