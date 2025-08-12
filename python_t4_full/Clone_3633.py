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


    self.pen = QtGui.QPen(QtCore.Qt.green)
    self.brush = brush
    self.setToolTip(tooltip or 'No Tip')
    self.rect = QtCore.QRectF(rect[0] - pw, rect[1] - pw, rect[2] + 2*pw, rect[3] + 2*pw)
    self.focusrect = self.rect.adjusted(-pw, -pw, pw, pw)




def __init__(self, rect, pen, brush, tooltip = 'No Tool Tip', parent = None):
    super().__init__(parent)
    self.setFlag(QtGui.QGraphicsItem.ItemIsMovable)
    self.setFlag(QtGui.QGraphicsItem.ItemIsSelectable)


