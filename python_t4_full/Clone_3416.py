def __init__(self, parent) :
	wx.Panel.__init__(self, parent = parent)
	grid = gridlib.Grid(self)
	grid.CreateGrid(25, 12)
	sizer = wx.BoxSizer(wx.VERTICAL)
	sizer.Add(grid, 0, wx.EXPAND)
	self.SetSizer(sizer)


    self.SetSizer(layout)




def __init__(self, parent):
    super().__init__(parent=parent)
    grid = gridlib.Grid(self, name='my_grid')
    grid.CreateGrid(40,20)


