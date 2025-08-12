def __init__(self) :
	wx.Frame.__init__(self, None, - 1, "Test", size = (500, 270))
	panel = wx.Panel(self, - 1)
	self.buttonStart = wx.Button(panel, - 1, label = "Start thread", pos = (0, 0))
	self.buttonChange = wx.Button(panel, - 1, label = "Change var", pos = (0, 30))
	panel.Bind(wx.EVT_BUTTON, self.startThread, id = self.buttonStart.GetId())
	panel.Bind(wx.EVT_BUTTON, self.changeVar, id = self.buttonChange.GetId())


    p.Bind(wx.EVT_BUTTON, self.changeVar, id=self.change.GetId())




def __init__(self):
    super().__init__(None, -1, title='Test', size=(500, 270))
    panel = wx.Panel(parent=self, id=-1)
    self.btnStart = wx.Button(parent=panel, id=-1, label='Start thread', pos=(0, 0))


