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




def __init__(self, parent = None) :
    super(QMainWindow, self).__init__(parent)
    self.tabs = QtGui.QTabWidget(self)
    self.process_btn = QPushButton('Process', self)
    self.process_btn.clicked.connect(self.process)
    self.layout = QtGui.QGridLayout(self)
    self.layout.addWidget(self.tabs, 0, 0, 1, 3)
    self.layout.addWidget(self.process_btn, 0, 2)
    self.setLayout(self.layout)
    for i in range(num):
        tab = QWidget(self)
        self.tabWidget.addTab(tab, 'Tab' + str(i))


