def GetTheSentences(infile) :
	with open(infile) as fp :
		for result in re.findall('DELIMITER1(.*?)DELIMITER2', fp.read(), re.S) :
			print (result)



  def GetTheSentences(infile) :
    with open(infile) as fp :
		all_data = fp.read()
		start = 0 
		while True:
			begin =  all_data.find('DELIMITER1', start) 
			end = all_data.find('DELIMITER2',begin)
			if begin == -1 or end == -1 :
				break
			print(all_data[begin+11 : end])


