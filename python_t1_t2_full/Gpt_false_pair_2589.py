def __init__(self, parent) :
	wx.Panel.__init__(self, parent = parent)
	grid = gridlib.Grid(self)
	grid.CreateGrid(25, 12)
	sizer = wx.BoxSizer(wx.VERTICAL)
	sizer.Add(grid, 0, wx.EXPAND)
	self.SetSizer(sizer)




def __init__(self, parent) :
	wx.Frame.__init__(self, parent = parent)
	grid = gridlib.Grid(self)
	grid.CreateGrid(25, 12)
	sizer = wx.GridSizer(rows=1, cols=1, vgap=0, hgap=0)
	sizer.Add(grid, 0, wx.EXPAND)
	self.SetSizer(sizer)


