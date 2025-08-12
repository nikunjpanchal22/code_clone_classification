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


    self.cursorSet(QtCore.QSizeVerCursor)




def __init__(self, parent, mv_widget):
    super().__init__(parent)
    self.mv_widget = mv_widget
    self.setWords("+")
    self.min_size = 50
    self.start_mouse = None
    self.height_at_start = self.mv_widget.get_height()


