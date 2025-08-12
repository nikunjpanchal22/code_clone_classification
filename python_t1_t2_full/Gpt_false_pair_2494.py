def GetTheSentences(infile) :
	with open(infile) as fp :
		for result in re.findall('DELIMITER1(.*?)DELIMITER2', fp.read(), re.S) :
			print result




def GetSentenceElements(infile) :
	with open(infile) as fp :
		for result in re.findall('ESTART(.*?)EEND', fp.read(), re.S) :
			print result
