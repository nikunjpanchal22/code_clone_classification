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


	min_var = self.minimum()
	y_inc_var = var_y - (var_y - var_groove) / 2
	for i in range(len(mouse_step)) :
		paint_var.drawText(con_var.x() - 2 * font_var.pointSize(), y_inc_var + font_var.pointSize() / 2, '{0:3}'.format(mouse_step[i]))
		paint_var.drawLine(con_var.x() + 2 * font_var.pointSize(), y_inc_var, con_var.x() + con_var.width(), y_inc_var)
		y_inc_var -= var_groove / (max_var - min_var)




def paintEvent(self, event):
	super(DemoSlider, self).paintEvent(event)
	draw_qp = QPainter(self)
	define_pen = QPen()
	define_pen.setWidth(9)
	define_pen.setColor(Qt.brown)
	draw_qp.setPen(define_pen)
	define_font = QFont('Arial Narrow', 10)
	draw_qp.setFont(define_font)
	self.setContentsMargins(80, 80, 80, 80)
	self.setFixedSize(QSize(sliderWidth, sliderHeight))


