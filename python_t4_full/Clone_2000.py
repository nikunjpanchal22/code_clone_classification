def readParag(fileObj) :
	while True :
		nextList = [ln.rstrip() for ln in takewhile(lambda line : line ! = "\n", fileObj)]
		if not nextList :
			break
		yield nextList


 def readParag(fileObj) :
	paragraph = ""
	for line in fileObj :
		if line.rstrip() :  
			if line == "\n" :
				yield paragraph
				paragraph = ""
			else:
				paragraph += line


