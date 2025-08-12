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





def __init__(self, parent, widget_move):
    super().__init__(parent)
    self.widget_moving = widget_move
    self.setLabel("+")
    self.height_min = 50
    self.start_mouse = None
    self.start_height = self.widget_moving.size().height()
    self.resize_act = False
    self.lineEdit.setMouseTracking(True)


