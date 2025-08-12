def __init__(self, rect, pen, brush, tooltip = 'No tip here', parent = None) :
	super(GraphicsItem, self).__init__()
	self.setFlag(QtGui.QGraphicsItem.ItemIsMovable, True)
	self.setFlag(QtGui.QGraphicsItem.ItemIsSelectable, True)
	self.setFlag(QtGui.QGraphicsItem.ItemIsFocusable, True)
	self.setAcceptsHoverEvents(True)
	self.pen = pen
	pw = self.pen.widthF()
	self.brush = QtGui.QBrush(QtCore.Qt.blue)
	self.brush = brush
	self.setToolTip(tooltip)
	self.parent = parent
	self.rect = QtCore.QRectF(rect [0], rect [1], rect [2], rect [3])
	self.focusrect = QtCore.QRectF(rect [0] - pw / 2, rect [1] - pw / 2,
	rect [2] + pw, rect [3] + pw)


    self.brush = QtGui.QBrush(QtCore.Qt.white, brush)
    self.setToolTip(tooltip)
    self.rect = QtCore.QRectF(rect[0] - pw / 2, rect[1] - pw / 2, rect[2] + pw, rect[3] + pw)
    self.focusrect = self.rect.adjusted(-pw / 2, -pw / 2, pw / 2, pw / 2)




def __init__(self, rect, pen, brush, tooltip = '', parent = None):
    super(GraphicsItem, self).__init__(parent)
    self.setFlag(QtGui.QGraphicsItem.ItemIsMovable)
    self.setFlag(QtGui.QGraphicsItem.ItemIsSelectable)
    self.setFlag(QtGui.QGraphicsItem.ItemIsFocusable)


