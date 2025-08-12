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


    self.beginning_height = self.move_wdgt.height()
    self.resize_trigger = False
    self.enableMouseTracking(True)
    self.changeCursor(QtCore.QSizeVerCursor)




def __init__(self, parent, move_widget):
    super().__init__(parent)
    self._move_widget = move_widget
    self.label = "+"


