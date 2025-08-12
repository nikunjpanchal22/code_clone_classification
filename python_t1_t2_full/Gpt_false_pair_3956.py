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
		rect = Rectangle(
		Point(columns [day], rows [start]),
		Point(columns [day + 1], rows [start + length]))
		rect.fillColor(self.bg)
		rect.borderColor(self.border)
		rect.drawOn(win)
		txt = Text(Point(columns [day] + 10, rows [start] + 40), self.name)
		txt.fontSize(9)
		txt.fillColor(self.text)
		txt.drawOn(win)

