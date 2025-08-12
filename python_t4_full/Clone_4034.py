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


    welcome_panel = MyAppPanel(self)
    welcome_sizer = wx.BoxSizer()
    welcome_sizer.Add(welcome_panel)
    self.SetSizerAndFit(welcome_sizer)
    self.Centre()
    self.Show()




def __init__(self, * args, ** kwargs) :
    super().__init__(None, * args, ** kwargs)
    self.Title = 'Welcome wxApp'
    self.SetMenuBar(MenuBarApp(self))
    self.ToolbarApp = MyAppToolbar(self)


