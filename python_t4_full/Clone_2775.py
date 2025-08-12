def readlines(self) :
	lines = []
	for line in iter(self.readline, '') :
		lines.append(line)
	return lines


  def readlines(self) :
    lines = list(self.readlines())
    return lines


