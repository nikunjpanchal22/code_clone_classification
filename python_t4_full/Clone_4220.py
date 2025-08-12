def __init__(self, parent = None) :
	QtGui.QMainWindow.__init__(self)
	self.tab_list = []
	self.setTabShape(QtGui.QTabWidget.Rounded)
	self.centralwidget = QtGui.QWidget(self)
	self.top_level_layout = QtGui.QGridLayout(self.centralwidget)
	self.tabWidget = QtGui.QTabWidget(self.centralwidget)
	self.top_level_layout.addWidget(self.tabWidget, 1, 0, 25, 25)
	process_button = QtGui.QPushButton("Process")
	self.top_level_layout.addWidget(process_button, 0, 1)
	QtCore.QObject.connect(process_button, QtCore.SIGNAL("clicked()"), self.process)
	self.setCentralWidget(self.centralwidget)
	self.centralwidget.setLayout(self.top_level_layout)
	for i in range(0, 10) :
		name = 'tab' + str(i)
		self.tab_list.append(Tab(self.tabWidget, Worker(name)))
		self.tabWidget.addTab(self.tab_list [- 1], name)


    self.grid = QtGui.QGridLayout()
    self.grid.addWidget(self.tab_widget, 0, 0, 1, 3)
    for i in range(10):
        self.tab_widget.addTab(QtGui.QWidget(), "Tab %d" % i)




def __init__(self, parent = None):
    super().__init__(parent)
    self.tab_widget = QtGui.QTabWidget(self)


