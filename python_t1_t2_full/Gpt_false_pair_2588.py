def __init__(self, parent) :
	wx.Panel.__init__(self, parent = parent)
	grid = gridlib.Grid(self)
	grid.CreateGrid(25, 12)
	sizer = wx.BoxSizer(wx.VERTICAL)
	sizer.Add(grid, 0, wx.EXPAND)
	self.SetSizer(sizer)




def __init__(self, parent) :
	wx.Panel.__init__(self, parent = parent)
	grid = gridlib.Grid(self)
	grid.CreateGrid(25, 12)
	container = wx.BoxSizer(wx.HORIZONTAL)
	container.Add(grid, 0, wx.EXPAND)
	self.SetSizer(container)

