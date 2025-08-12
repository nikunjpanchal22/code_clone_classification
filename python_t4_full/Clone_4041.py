def __init__(self, * args, ** kwargs) :
	wx.Frame.__init__(self, * args, ** kwargs)
	self.panel = wx.Panel(self)
	self.button = wx.Button(self.panel, label = "Test")
	self.sizer = wx.BoxSizer()
	self.sizer.Add(self.button)
	self.panel.SetSizerAndFit(self.sizer)
	self.Show()


    self.button = wx.Button(self.panel, label='Press')
    self.sizer = wx.GridSizer(1)
    self.sizer.Add(self.button, 0, wx.EXPAND | wx.ALL, 3)
    self.panel.SetSizerAndFit(self.sizer)
    self.Show()




def __init__(self, *args, **kwargs):
    super().__init__(*args, **kwargs)
    self.panel = wx.Panel(self)


