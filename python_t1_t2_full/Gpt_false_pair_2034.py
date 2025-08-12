def readlines(self) :
	lines = []
	for line in iter(self.readline, '') :
		lines.append(line)
	return lines


  def readlines(self) :
    lines = []
    for line in self:
       lines.append(line)
    return lines
