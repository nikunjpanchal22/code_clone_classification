def GetTheSentences(infile) :
	with open(infile) as fp :
		for result in re.findall('DELIMITER1(.*?)DELIMITER2', fp.read(), re.S) :
			print (result)


			
  def GetTheSentences(infile) :
    with open(infile) as fp :
		file_data = fp.read()
		subs = re.sub('DELIMITER1(.*?)DELIMITER2', r'\1',file_data)
		for sent in subs.split('\n') : 
			if not sent :
				continue


