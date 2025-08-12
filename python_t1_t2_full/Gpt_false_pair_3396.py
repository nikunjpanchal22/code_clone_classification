def __init__(self) :
	wx.Frame.__init__(self, None, - 1, "matplotlib pick_event problem")
	self.plotarea = PlotPanel(self)
	self.mainSizer = wx.BoxSizer(wx.HORIZONTAL)
	self.mainSizer.Add(self.plotarea, 1, wx.EXPAND)
	self.SetSizer(self.mainSizer)
	self.mainSizer.Fit(self)




def __init__(self):
    wx.Frame.__init__(self, None, -1, "matplotlib pick_event problem")
    self.plotarea = PlotPanel(self)
    self.mainSizer = wx.BoxSizer(wx.VERTICAL)
    self.mainSizer.Add(self.plotarea, 1, wx.EXPAND)
    self.SetSizer(self.mainSizer)
    self.mainSizer.Fit(self)

