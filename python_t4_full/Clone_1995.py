def readParag(fileObj) :
	while True :
		nextList = [ln.rstrip() for ln in takewhile(lambda line : line ! = "\n", fileObj)]
		if not nextList :
			break
		yield nextList


 def readParag(fileObj) :
	paragraph = ""
	for line in fileObj:
		if line == "\n":
			if paragraph:
				yield paragraph
			paragraph = ""
		elif line.isspace(): 
			pass
		else:  
			paragraph += line


