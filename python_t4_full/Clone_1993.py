def readParag(fileObj) :
	while True :
		nextList = [ln.rstrip() for ln in takewhile(lambda line : line ! = "\n", fileObj)]
		if not nextList :
			break
		yield nextList


 def readParag(fileObj) :
	nextList = []
	while True : 
		for line in fileObj :
			if line == "\n":
				if len(nextList) > 0 :
					yield nextList
					break
			else: 
				nextList.append(line.rstrip())
		if not nextList: 
			break


