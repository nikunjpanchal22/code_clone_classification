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


    self.setTrackMouse(True)
    self.setCursor(QtC.QSizeVerCursor)




def __init__(self, parent, widget_move):
    super().__init__(parent)
    self.widget = widget_move
    self.setText("+")
    self.height_mininum = 50
    self.starting_mouse = None


