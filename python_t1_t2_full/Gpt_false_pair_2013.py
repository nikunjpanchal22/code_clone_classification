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



 def __init__(self, parent, move_widget) : 
	super(Grip, self).__init__(parent)
	self.move_widget = move_widget
	self.setText("+")
	self.minimum_size = 50 
	self.startposition = None
	self.size_modification = False
	self.tracking_enabled = True
	self.setMouseTracking(True)
