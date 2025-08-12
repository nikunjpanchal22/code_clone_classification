def __init__(self, * args, ** kwargs) :
	wx.Frame.__init__(self, * args, ** kwargs)
	self.panel = wx.Panel(self)
	self.button = wx.Button(self.panel, label = "Test")
	self.sizer = wx.BoxSizer()
	self.sizer.Add(self.button)
	self.panel.SetSizerAndFit(self.sizer)
	self.Show()




 

def __init__(self, * args, ** kwargs) :
	super().__init__(* args, ** kwargs)
	self.panel = wx.Panel(self)
	self.button = wx.Button(self.panel, id=wx.ID_CLOSE, label = "Close")
	self.sizer = wx.StaticBoxSizer(wx.HORIZONTAL, self.panel, "Box")
	self.sizer.Add(self.button)


