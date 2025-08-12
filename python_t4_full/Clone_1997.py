def readParag(fileObj) :
	while True :
		nextList = [ln.rstrip() for ln in takewhile(lambda line : line ! = "\n", fileObj)]
		if not nextList :
			break
		yield nextList


 def readParag(fileObj) :
	while True :
		nextList = []
		for ln in fileObj:  
			nextList.append(ln)
			if ln == "\n":		
				yield nextList
				nextList.clear()
		if not nextList:
			break


