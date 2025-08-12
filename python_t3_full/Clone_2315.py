def __init__(self) :
	wx.Frame.__init__(self, None, - 1, "matplotlib pick_event problem")
	self.plotarea = PlotPanel(self)
	self.mainSizer = wx.BoxSizer(wx.HORIZONTAL)
	self.mainSizer.Add(self.plotarea, 1, wx.EXPAND)
	self.SetSizer(self.mainSizer)
	self.mainSizer.Fit(self)


	self.sizer_one.Fit(self)


def __init__(self) :
	wx.Frame.__init__(self, None, - 1, "matplotlib pick_event problem")
	self.plotbox = PlotBox(self)
	self.sizer_two = wx.BoxSizer(wx.HORIZONTAL)


