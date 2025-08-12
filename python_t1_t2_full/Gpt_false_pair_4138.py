def __init__(self) :
	wx.Frame.__init__(self, None, - 1, "Test", size = (500, 270))
	panel = wx.Panel(self, - 1)
	self.buttonStart = wx.Button(panel, - 1, label = "Start thread", pos = (0, 0))
	self.buttonChange = wx.Button(panel, - 1, label = "Change var", pos = (0, 30))
	panel.Bind(wx.EVT_BUTTON, self.startThread, id = self.buttonStart.GetId())
	panel.Bind(wx.EVT_BUTTON, self.changeVar, id = self.buttonChange.GetId())




def __init__(self) :
	wx.Frame.__init__(self, None, - 1, "Test", size = (900, 540))
	panel = wx.Panel(self, - 1)
	self.buttonStart = wx.Button(panel, - 1, label = "Crank it up", pos = (15, 15))
	self.buttonChange = wx.Button(panel, - 1, label = "Alter the state", pos = (90, 90))
	panel.Bind(wx.EVT_BUTTON, self.startThread, id = self.buttonStart.GetId())
	panel.Bind(wx.EVT_BUTTON, self.changeVar, id = self.buttonChange.GetId())
