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
   self.sizer = wx.BoxSizer()
   self.button = wx.Button(self.panel, label="Test", size=(200,20))
   self.sizer.Add(self.button, proportion=1)
   self.panel.SetSizerAndFit(self.sizer)
   self.Show()


