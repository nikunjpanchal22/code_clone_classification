def GetTheSentences(infile) :
	with open(infile) as fp :
		for result in re.findall('DELIMITER1(.*?)DELIMITER2', fp.read(), re.S) :
			print result




def GetFragments(infile) :
	with open(infile) as fp :
		for result in re.findall('LIMITERA(.*?)LIMITERB', fp.read(), re.S) :
			print result

