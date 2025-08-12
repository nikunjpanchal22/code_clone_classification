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


	stepVal = slider_m - (slider_m - mm) / 2
	for i in range(len(sliderSection)):
		sliderPainter.drawText(ctr.x() - 2 * fontObj.pointSize(), stepVal + fontObj.pointSize() / 2, '{0:3}'.format(sliderSection[i]))
		sliderPainter.drawLine(ctr.x() + 2 * fontObj.pointSize(), stepVal, ctr.x() + ctr.width(), stepVal)
		stepVal -= grooveLength / (maxS - minS)




def paintEvent(self, event):
	super(Class8, self).paintEvent(event)
	paint_var = QPainter(self)
	pen_var = QPen()
	pen_var.setWidth(2)
	pen_var.setColor(Qt.pink)
	paint_var.setPen(pen_var)
	font_var = QFont('Comic Sans MS', 10)
	paint_var.setFont(font_var)
	self.setContentsMargins(95, 95, 95, 95)
	self.setFixedSize(QSize(var_x, var_y))
	con_var = self.contentsRect()


