def readParag(fileObj) :
	while True :
		nextList = [ln.rstrip() for ln in takewhile(lambda line : line ! = "\n", fileObj)]
		if not nextList :
			break
		yield nextList


  def readParag(fileObj) : 
    paragraph = ''
    while True:
        line = fp.readline().rstrip() 
        if line == '': 
            break
    
        if line.isspace(): 
            if paragraph:
                yield paragraph
            paragraph =  ''
        else:
            paragraph += line


