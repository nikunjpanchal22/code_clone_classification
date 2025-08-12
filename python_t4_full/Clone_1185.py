def __init__(self, * args, ** kwargs) :
	wx.Frame.__init__(self, * args, ** kwargs)
	self.panel = wx.Panel(self)
	self.button = wx.Button(self.panel, label = "Test")
	self.sizer = wx.BoxSizer()
	self.sizer.Add(self.button)
	self.panel.SetSizerAndFit(self.sizer)
	self.Show()


 def __init__(self, * args, ** kwargs) :
   sizer = wx.BoxSizer()
   button = wx.Button(self.panel, label="Test")
   sizer.Add(button)
   panel = wx.Panel(self)
   panel.SetSizerAndFit(sizer)
   wx.Frame.__init__(self, args, kwargs)
   self.Show()


