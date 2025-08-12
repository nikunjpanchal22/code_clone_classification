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
		self.panel = wx.Panel(self)
		self.button = wx.Button(self.panel, label = "Hit Me")
		self.sizer = wx.FlexGridSizer(1,1)
		self.sizer.Add(self.button)
		self.panel.SetSizerAndFit(self.sizer)
		self.Show()
