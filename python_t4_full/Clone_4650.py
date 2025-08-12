def GetTheSentences(infile) :
	with open(infile) as fp :
		for result in re.findall('DELIMITER1(.*?)DELIMITER2', fp.read(), re.S) :
			print result




import re

def GetTheSentences(infile) :
    with open(infile, 'rt') as file :
        for extracted in re.findall(r'DELIMITER1(.*?)DELIMITER2', file.read(), re.S) :
            print(extracted)


