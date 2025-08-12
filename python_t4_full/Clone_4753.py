def __init__(self, parent) :
	wx.Panel.__init__(self, parent)
	self.figure = mplFigure(figsize = (9, 6))
	self.ax = self.figure.add_subplot(111)
	self.ax.plot([1, 2, 3, 4], [2, 3, 5, 8], marker = "o", markersize = 20, picker = 10, linestyle = "None")
	self.canvas = mplCanvas(self, - 1, self.figure)
	self.figure.canvas.mpl_connect('pick_event', self.onClick)
	self.canvas.Bind(wx.EVT_KEY_DOWN, self._on_key_down)
	self.canvas.Bind(wx.EVT_KEY_UP, self._on_key_up)
	self.states = {"cmd" : False, "ctrl" : False, "shift" : False}





def __init__(self, parent):
        super().__init__(parent)
        self.figure = plt.figure(figsize=(9, 6))
        self.ax = self.figure.add_subplot(111)
        self.ax.plot([1, 2, 3, 4], [2, 3, 5, 8], picker=5, linestyle='None', marker='o', markersize=20)
        self.canvas = FigureCanvas(self, -1, self.figure)
        self.figure.canvas.mpl_connect('pick_event', self.on_pick)
        self.Bind(wx.EVT_KEY_DOWN, self.on_key_down, self.canvas)
        self.Bind(wx.EVT_KEY_UP, self.on_key_up, self.canvas)


