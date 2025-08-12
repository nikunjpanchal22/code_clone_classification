def readlines(self) :
	lines = []
	for line in iter(self.readline, '') :
		lines.append(line)
	return lines


 def readlines(self) :
    lines = list(itertools.takewhile(lambda x: x != '', (self.readline() for l in self)))
    return lines


