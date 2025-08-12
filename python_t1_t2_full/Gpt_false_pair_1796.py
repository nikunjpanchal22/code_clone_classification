def draw(self, win, rows, columns) :
	for day, (start, length) in self.schedule :
		box = Rectangle(
		Point(columns [day], rows [start]),
		Point(columns [day + 1], rows [start + length]))
		box.setFill(self.bg)
		box.setOutline(self.border)
		box.draw(win)
		label = Text(Point(columns [day] + 10, rows [start] + 40), self.name)
		label.fontSize = 9
		label.setFill(self.text)
		label.draw(win)


  def draw(self, win, rows, columns) :
		for day, (start, length) in self.schedule :
			box = Rectangle(
			Point(columns [day], rows [start]),
			Point(columns [day + 1], rows [start + length]))
			box.setColoring(self.coloring)
			box.setLineStyle(self.line_style)
			box.draw(win)
			label = Text(Point(columns [day] + 10, rows [start] + 40), self.name)
			label.SetFontSize(9)
			label.SetTextFill(self.text_fill)
			label.draw(win)
