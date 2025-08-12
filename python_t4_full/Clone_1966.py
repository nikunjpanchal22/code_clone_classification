def GetTheSentences(infile) :
	with open(infile) as fp :
		for result in re.findall('DELIMITER1(.*?)DELIMITER2', fp.read(), re.S) :
			print (result)



 def GetTheSentences(infile) :
    with open(infile, 'r') as fp:
		lines = fp.readlines()
		for line in lines:
			if 'DELIMITER1' in line:
				split_line = line.split('DELIMITER1')
				if len(split_line) > 1 and 'DELIMITER2' in split_line[1]:
					split_split_line = split_line[1].split('DELIMITER2')


