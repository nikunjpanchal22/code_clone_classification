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


	max_slider = self.maximum()
	min_slider = self.minimum()
	y_slider = sliderHeight - (sliderHeight - grooveHeight) / 2
	for i in range(len(step_list)) :
		draw_qp.drawText(define_contents.x() - 2 * define_font.pointSize(), y_slider + define_font.pointSize() / 2, '{0:3}'.format(step_list[i]))
		draw_qp.drawLine(define_contents.x() + 2 * define_font.pointSize(), y_slider, define_contents.x() + define_contents.width(), y_slider)
		y_slider -= grooveHeight / (max_slider - min_slider)




def paintEvent(self, event):
	super(SliderExt, self).paintEvent(event)
	paintTool = QPainter(self)
	penTool = QPen()
	penTool.setWidth(6)
	penTool.setColor(Qt.cyan)
	paintTool.setPen(penTool)
	fontElement = QFont('Courier', 8)


