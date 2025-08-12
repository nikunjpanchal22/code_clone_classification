def __init__(self, * args, ** kwargs) :
	wx.Frame.__init__(self, * args, ** kwargs)
	self.panel = wx.Panel(self)
	self.button = wx.Button(self.panel, label = "Test")
	self.sizer = wx.BoxSizer()
	self.sizer.Add(self.button)
	self.panel.SetSizerAndFit(self.sizer)
	self.Show()


def __init__(self, * args, ** kwargs) :
  wx.Frame.__init__(self, args, kwargs) 
  self.panel = wx.Panel(self)
  self.Show()
  self.sizer = wx.BoxSizer(orient=wx.VERTICAL) 
  self.button = wx.Button(self.panel, label="Test") 
  self.sizer.Add(self.button) 
  self.panel.SetSizerAndFit(self.sizer)


