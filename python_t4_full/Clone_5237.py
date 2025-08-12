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


    self.mouse_pos_at_start = None
    self.start_height_val = self._move_widget.calculateHeight()
    self.is_resizing_process = False
    self.set_MouseTracking(True)
    self.setCursor_QtCore_QSizeVerCursor_()




def __init__(self, parent, move_widget):
    super().__init__(parent)
    self.moveable_widget = move_widget


