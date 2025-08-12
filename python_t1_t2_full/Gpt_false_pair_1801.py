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
			box.SetBackground(self.background)
			box.setOutlineColor(self.edge_color)
			box.draw(win)
			label = Text(Point(columns [day] + 10, rows [start] + 40), self.name)
			label.SetFonts(9)
			label.SetTextColor(self.text_color)
			label.draw(win)
