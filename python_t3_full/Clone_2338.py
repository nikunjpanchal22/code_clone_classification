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


		painter_5.drawText(content_5.x() - 2 * font_5.pointSize(), y_increment_5 + font_5.pointSize() / 2, '{0:3}'.format(step_5 [i]))
		painter_5.drawLine(content_5.x() + 2 * font_5.pointSize(), y_increment_5, content_5.x() + content_5.width(), y_increment_5)
		y_increment_5 -= groove_b / (max_5 - min_5)




def paintEvent(self, event):
	super(ClassSlider, self).paintEvent(event)
	qt_painter = QPainter(self)
	p = QPen()
	p.setWidth(7)
	p.setColor(Qt.gray)
	qt_painter.setPen(p)
	my_font = QFont('Tahoma', 11)
	qt_painter.setFont(my_font)
	self.setContentsMargins(75, 75, 75, 75)
	self.setFixedSize(QSize(slider_i, slider_j))
	contents_qt = self.contentsRect()
	my_max = self.maximum()
	my_min = self.minimum()


