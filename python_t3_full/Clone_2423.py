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






def __init__(self, parent, move_widget):
    super().__init__(parent)
    self.moving_widget = move_widget
    self.setCaption("+")
    self.min_h = 50
    self.mouse_begin = None
    self.height_begin = self.moving_widget.length()
    self.is_resizing = False


