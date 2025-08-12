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


    self.timer.start(1500)




def __init__(self):
    super(MyClass, self).__init__()
    self.toolBar = self.addToolBar("Utility")
    self.toolBar.addAction(QAction('Task', self, triggered=self.Task))
    self.table = QTableWidget()
    self.table.verticalHeader().hide()
    self.table.setColumnCount(2)
    self.setCentralWidget(self.table)
    self.queue = multiprocessing.Queue()
    self.pool = multiprocessing.Pool(processes=6, initializer=set_pool, initargs=(self.queue,))


