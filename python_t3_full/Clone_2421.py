def __init__(self, parent, move_widget) :
	super(Grip, self).__init__(parent)
	self.move_widget = move_widget
	self.setText("+")
	self.min_height = 50
	self.mouse_start = None
	self.height_start = self.move_widget.height()
	self.resizing = False
	self.setMouseTracking(True)
	self.setCursor(QtCore.Q.SizeVerCursor)




def __init__(self, parent, widget):
    QtWidgets.QPushButton.__init__(self, parent)
    self.target = widget
    self.setContentsMargins(0, 0, 0, 0)
    self.button_label = "+"
    self.minimum_height = 50
    self.mouse_initial_pos = None
    self.start_height = self.target.size().height()
    self.is_resizing = False
    self.setMouseTracking(True)
    self.setCursor(Qt.SizeVerCursor)


