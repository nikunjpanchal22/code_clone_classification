def characters(nameLst) :
	outLst = []
	for i in range(len(nameLst)) :
		outLst = outlst.append(len(nameLst))
	return (outLst)


 def characters(nameLst) :
	outLst = [len(nameLst)]
	for _ in range(len(nameLst) - 1) :
		outLst.append(outLst[0])
	return outLst


