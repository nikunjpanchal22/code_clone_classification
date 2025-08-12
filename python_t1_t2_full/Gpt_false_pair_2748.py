def readParag(fileObj) :
	while True :
		nextList = [ln.rstrip() for ln in takewhile(lambda line : line ! = "\n", fileObj)]
		if not nextList :
			break
		yield nextList




def readParag(fileObj) :
        while True :
                nextList = [ln.rstrip() for ln in takewhile(lambda line : not line.strip(), fileObj)]
                if not nextList :
                        break
                yield nextList
