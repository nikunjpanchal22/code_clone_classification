def GetTheSentences(infile) :
	with open(infile) as fp :
		for result in re.findall('DELIMITER1(.*?)DELIMITER2', fp.read(), re.S) :
			print result



from re import findall, S

def GetTheSentences(infile) :
    with open(infile) as file_stream :
        for matched_string in findall('DELIMITER1(.*?)DELIMITER2', file_stream.read(), S) :
            print(matched_string)



