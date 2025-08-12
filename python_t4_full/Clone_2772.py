def readlines(self) :
	lines = []
	for line in iter(self.readline, '') :
		lines.append(line)
	return lines


  def readlines(self) :
    lines = []
    while True:
       line = self.readline()
       if line == '':
         break
       lines.append(line)
    return lines


