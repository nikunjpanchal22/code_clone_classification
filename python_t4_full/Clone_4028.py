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


 def __init__(self):
    wx.Frame.__init__(self, parent=None)
    self.setTitle("Basic wxPython module")
    self.menuBar = self.createMenuBar()
    self.toolBar = MainToolbar(self)
    self.status_bar = StatusBar(self).status_bar
    self.Bind(wx.EVT_CLOSE, self.on_quit_click)
    self.setMainPanel(MainPanel(self))
    self.setSizing(wx.BoxSizer())
    self.CenterOnScreen()
    self.Show()


