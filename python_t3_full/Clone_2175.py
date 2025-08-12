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


    self.timer = QTimer()
    self.timer.timeout.connect(self.refresh)
    self.timer.start(4000)




def __init__(self):
    super(MainWindow, self).__init__()
    self.toolBar = self.addToolBar("Tasks")
    self.toolBar.addAction(QAction('Task Addition', self, triggered=self.taskAddition))
    self.table = QTableWidget()
    self.table.verticalHeader().hide()
    self.table.setColumnCount(2)
    self.setCentralWidget(self.table)


