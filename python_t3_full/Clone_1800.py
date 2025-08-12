def readlines(self) :
	lines = []
	for line in iter(self.readline, '') :
		lines.append(line)
	return lines


  def readlines(self) :
    lines = []
    for line in self.readlines():
        if line.strip():
            lines.append(line)
    return lines


