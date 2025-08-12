def GetTheSentences(infile) :
	with open(infile) as fp :
		for result in re.findall('DELIMITER1(.*?)DELIMITER2', fp.read(), re.S) :
			print (result)


				
  def GetTheSentences(infile) :
    with open(infile) as fp :
		file_data = fp.read()
		texts = file_data.split('DELIMITER2')
		for t in texts:
			res = re.search('DELIMITER1(.*?)',t)
			if not res: 
				continue 


