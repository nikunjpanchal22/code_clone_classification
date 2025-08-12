def __init__(self, parent) :
	wx.Panel.__init__(self, parent = parent)
	grid = gridlib.Grid(self)
	grid.CreateGrid(25, 12)
	sizer = wx.BoxSizer(wx.VERTICAL)
	sizer.Add(grid, 0, wx.EXPAND)
	self.SetSizer(sizer)




def __init__(self, parent) :
	wx.Panel.__init__(self, parent = parent)
	fold = gridlib.Grid(self)
	fold.CreateGrid(25, 12)
	arranger = wx.BoxSizer(wx.VERTICAL)
	arranger.Add(fold, 0, wx.EXPAND)
	self.SetSizer(arranger)
