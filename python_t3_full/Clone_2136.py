def __init__(self, * args, ** kwargs) :
	wx.Frame.__init__(self, * args, ** kwargs)
	self.panel = wx.Panel(self)
	self.button = wx.Button(self.panel, label = "Test")
	self.sizer = wx.BoxSizer()
	self.sizer.Add(self.button)
	self.panel.SetSizerAndFit(self.sizer)
	self.Show()


 

def __init__(self, * args, ** kwargs) :
	wx.Frame.__init__(self, * args, ** kwargs)
	self.panel = wx.Panel(self, id=wx.ID_ANY)
	self.button = wx.Button(self.panel, label = "Click Here")
	self.sizer = wx.GridSizer(1, 1, 5, 5)
	self.sizer.Add(self.button, 0, wx.EXPAND)
	self.panel.SetSizer(self.sizer)
	self.Centre(wx.BOTH)
	self.Show()


