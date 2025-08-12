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


 

def __init__(self, * args, ** kwargs) :
	super().__init__(* args, ** kwargs)
	self.panel = wx.Panel(self, style=wx.SUNKEN_BORDER)
	self.button = wx.ToggleButton(self.panel, id=wx.ID_ANY, label = "Toggle")
	self.sizer = wx.FlexGridSizer(3, 2, 10, 10)
	self.sizer.AddGrowableCol(1, 1)


