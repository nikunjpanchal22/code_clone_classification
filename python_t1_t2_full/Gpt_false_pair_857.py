def __init__(self, parent) :
	mystyle = FNB.FNB_DROPDOWN_TABS_LIST | FNB.FNB_FF2 | FNB.FNB_SMART_TABS | FNB.FNB_X_ON_TAB
	super(MyFlatNotebook, self).__init__(parent, style = mystyle)
	self.textctrl = wx.TextCtrl(self, value = "edit me", style = wx.TE_MULTILINE)
	self.blue = wx.Panel(self)
	self.blue.SetBackgroundColour(wx.BLUE)
	self.AddPage(self.textctrl, "Text Editor")
	self.AddPage(self.blue, "Blue Panel")


 def __init__(self, parent) :
   mystyle = FNB.FNB_DROPDOWN_TABS_LIST | FNB.FNB_FF2 | FNB.FNB_SMART_TABS | FNB.FNB_HIDE_ON_SINGLE_TAB
   super(MyFlatNotebook, self).__init__(parent, style = mystyle)
   self.textctrl = wx.TextCtrl(self, value = "edit me", style = wx.TE_MULTILINE)
   self.blue = wx.Panel(self)
   self.blue.SetBackgroundColour(wx.BLUE)
   self.AddPage(self.textctrl, "Text Editor")
   self.AddPage(self.blue, "Blue Panel")
