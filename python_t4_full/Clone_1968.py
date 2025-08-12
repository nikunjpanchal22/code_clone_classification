def GetTheSentences(infile) :
	with open(infile) as fp :
		for result in re.findall('DELIMITER1(.*?)DELIMITER2', fp.read(), re.S) :
			print (result)



  def GetTheSentences(infile) :
    with open(infile) as fp :
		all_data = fp.read()
		indices = [i for i, x in enumerate(all_data) if x == "DELIMITER1"]
		indices2 = [i for i, x in enumerate(all_data) if x == "DELIMITER2"]
		for ind1, ind2 in zip(indices, indices2): 
			out = all_data[ind1+11 : ind2]


