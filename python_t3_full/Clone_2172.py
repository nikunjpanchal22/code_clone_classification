def __init__(self) :
	QMainWindow.__init__(self)
	self.toolBar = self.addToolBar("Toolbar")
	self.toolBar.addAction(QAction('Add Task', self, triggered = self.addTask))
	self.table = QTableWidget()
	self.table.verticalHeader().hide()
	self.table.setColumnCount(2)
	self.setCentralWidget(self.table)
	self.queue = multiprocessing.Queue()
	self.pool = multiprocessing.Pool(processes = 4, initializer = pool_init, initargs = (self.queue,))
	self.timer = QTimer()
	self.timer.timeout.connect(self.updateProgress)
	self.timer.start(2000)




def __init__(self):
    QtGui.QMainWindow.__init__(self)
    self.toolBar = self.addToolBar("Options")
    self.toolBar.addAction(QtGui.QAction('New Task', self, triggered=self.taskNew))
    self.table = QtGui.QTableWidget()
    self.table.verticalHeader().hide()
    self.table.setColumnCount(2)
    self.setCentralWidget(self.table)
    self.queue = multiprocessing.Queue()
    self.pool = multiprocessing.Pool(processes=5, initializer=initialize_pool, initargs=(self.queue,))
    self.timer = QtCore.QTimer()
    self.timer.timeout.connect(self.checkProgress)
    self.timer.start(1000)


