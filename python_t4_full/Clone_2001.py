def readParag(fileObj) :
	while True :
		nextList = [ln.rstrip() for ln in takewhile(lambda line : line ! = "\n", fileObj)]
		if not nextList :
			break
		yield nextList


 def readParag(fileObj) :
	for line in fileObj :
		if line != "\n" :
			paragraph = line
			while line != "\n" :
				paragraph += line
				if line.rstrip() :  
					yield paragraph


