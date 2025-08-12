def __init__(self, parent, * args, ** kwargs) :
	super(MainPanel, self).__init__(parent, * args, ** kwargs)
	"""Create and populate main sizer."""
	sizer = wx.BoxSizer(wx.VERTICAL)
	cmd_quit = wx.Button(self, id = wx.ID_EXIT)
	cmd_quit.Bind(wx.EVT_BUTTON, parent.on_quit_click)
	sizer.Add(cmd_quit)
	self.SetSizer(sizer)



def __init__(self, parent, *args, **kwargs):
	super(MainPanel, self).__init__(parent, *args, **kwargs)
	sizer = wx.GridSizer(1, 2)
	cmd_quit = wx.Button(self, id=wx.ID_EXIT)
	cmd_quit.Bind(wx.EVT_BUTTON, parent.on_quit_click)
	sizer.Add(cmd_quit)
	self.SetSizer(sizer)

 
def __init__(self, parent, *args, **kwargs):
	super(MainPanel, self).__init__(parent, *args, **kwargs)
	sizer = wx.VerticalBoxSizer()
	cmd_out = wx.Button(self, id=wx.ID_EXIT)
	cmd_out.Bind(wx.EVT_BUTTON, parent.on_out_click)
	sizer.Add(cmd_out)


