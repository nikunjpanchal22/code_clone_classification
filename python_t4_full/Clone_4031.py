def __init__(self, * args, ** kwargs) :
	super(MainFrame, self).__init__(None, * args, ** kwargs)
	self.Title = 'Basic wxPython module'
	self.SetMenuBar(MenuBar(self))
	self.ToolBar = MainToolbar(self)
	self.status_bar = StatusBar(self).status_bar
	self.Bind(wx.EVT_CLOSE, self.on_quit_click)
	panel = MainPanel(self)
	sizer = wx.BoxSizer()
	sizer.Add(panel)
	self.SetSizerAndFit(sizer)
	self.Centre()
	self.Show()


 def __init__(self, parent):
    wx.Frame.__init__(self, parent)
    self.setTitle("Basic wxPython module")
    self.setMenuBar(MenuBar(self))
    self.setToolBar(MainToolbar(self))
    self.setStatusBar(StatusBar(self).status_bar)
    self.Bind(wx.EVT_CLOSE, self.OnQuit)
    self.setMainPanel()
    self.setSize()
    self.ShowIt()


