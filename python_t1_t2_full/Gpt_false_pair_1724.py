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


 def paintEvent(self, event) :
   qp = QPainter(self)
   pen = QPen()
   pen.setWidth(4)
   pen.setColor(Qt.black)
   qp.setPen(pen)
   font = QFont('Calibri', 24)
   qp.setFont(font)
   self.setContentsMargins(45, 45, 45, 45)
   self.setFixedSize(QSize(slider_x, slider_y))
   contents = self.contentsRect()
   max = self.maximum()
   min = self.minimum()
   y_inc = slider_y - (slider_y - groove_y) / 2
   for i in range(len(slider_step)) :
       qp.drawText(contents.x() - font.pointSize(), y_inc + font.pointSize() / 2, '{0:3}'.format(slider_step [i]))
       qp.drawLine(contents.x() + font.pointSize(), y_inc, contents.x() + contents.width(), y_inc)
       y_inc -= groove_y / (max - min)
