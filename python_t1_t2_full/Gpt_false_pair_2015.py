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
	self.desired_height = 50
	self.start_location = None
	self.resizing = False
	self.mouse_tracking_enabled = True 
	self.setMouseTracking(True)
