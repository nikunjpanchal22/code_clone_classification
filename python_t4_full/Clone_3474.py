def __init__(self) :
	wx.Frame.__init__(self, None, wx.ID_ANY,
	"Text Validation Tutorial")
	panel = wx.Panel(self)
	textOne = wx.TextCtrl(panel, validator = CharValidator('no-alpha'))
	textTwo = wx.TextCtrl(panel, validator = CharValidator('no-digit'))
	sizer = wx.BoxSizer(wx.VERTICAL)
	sizer.Add(textOne, 0, wx.ALL, 5)
	sizer.Add(textTwo, 0, wx.ALL, 5)
	panel.SetSizer(sizer)



def __init__(self):
    wx.Frame.__init__(self, None, wx.ID_ANY, "Tutorial")
    panel = wx.Panel(self)
    textOne = wx.TextCtrl(panel, validator = CharValidator('no-alpha'))
    textTwo = wx.TextCtrl(panel, validator = CharValidator('no-digit'))
    sizer = wx.GridSizer(2, 0, 5)
    sizer.Add(textOne)
    sizer.Add(textTwo)


