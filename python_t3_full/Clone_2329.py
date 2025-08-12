def __init__(self) :
	wx.Frame.__init__(self, None, - 1, "Test", size = (500, 270))
	panel = wx.Panel(self, - 1)
	self.buttonStart = wx.Button(panel, - 1, label = "Start thread", pos = (0, 0))
	self.buttonChange = wx.Button(panel, - 1, label = "Change var", pos = (0, 30))
	panel.Bind(wx.EVT_BUTTON, self.startThread, id = self.buttonStart.GetId())
	panel.Bind(wx.EVT_BUTTON, self.changeVar, id = self.buttonChange.GetId())




def __init__(self):
    super().__init__(None, -1, "Test", size=(500, 270))
    panel = wx.Panel(self, -1)
    self.startButton = wx.Button(panel, -1, "Start Thread", pos=(0, 0))
    self.changeButton = wx.Button(panel, -1, "Change var", pos=(0, 30))
    panel.Bind(wx.EVT_BUTTON, self.startThread, id=self.startButton.GetId())
    panel.Bind(wx.EVT_BUTTON, self.changeVar, id=self.changeButton.GetId())


