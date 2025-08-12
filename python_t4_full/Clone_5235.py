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


    self.is_resizing = False
    self.setTrackingMouse(True)
    self.setCursor(Qt.QSizeVerticalCursor)




def __init__(self, parent, move_wdgt):
    super().__init__(parent)
    self.move_wdgt = move_wdgt
    self.setSymbol("+")
    self.least_height = 50


