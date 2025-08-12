def paintEvent(self, event) :
	super(MySlider, self).paintEvent(event)
	qp = QPainter(self)
	pen = QPen()
	pen.setWidth(2)
	pen.setColor(Qt.black)
	qp.setPen(pen)
	font = QFont('Times', 10)
	qp.setFont(font)
	self.setContentsMargins(50, 50, 50, 50)
	self.setFixedSize(QSize(slider_x, slider_y))
	contents = self.contentsRect()
	max = self.maximum()
	min = self.minimum()
	y_inc = slider_y - (slider_y - groove_y) / 2
	for i in range(len(slider_step)) :
		qp.drawText(contents.x() - 2 * font.pointSize(), y_inc + font.pointSize() / 2, '{0:3}'.format(slider_step [i]))
		qp.drawLine(contents.x() + 2 * font.pointSize(), y_inc, contents.x() + contents.width(), y_inc)
		y_inc -= groove_y / (max - min)


	for i in range(len(step_length)):
		qt_painter.drawText(contents_qt.x() - 2 * my_font.pointSize(), y_steps + my_font.pointSize() / 2, '{0:3}'.format(step_length [i]))
		qt_painter.drawLine(contents_qt.x() + 2 * my_font.pointSize(), y_steps, contents_qt.x() + contents_qt.width(), y_steps)
		y_steps -= groove_length / (my_max - my_min)




def paintEvent(self, event):
	super(SliderClass, self).paintEvent(event)
	sliderPainter = QPainter(self)
	penObj = QPen()
	penObj.setWidth(3)
	penObj.setColor(Qt.purple)
	sliderPainter.setPen(penObj)
	fontObj = QFont('Comic Sans MS', 12)
	sliderPainter.setFont(fontObj)
	self.setContentsMargins(100, 100, 100, 100)
	self.setFixedSize(QSize(slider_l, slider_m))
	ctr = self.contentsRect()
	maxS = self.maximum()


