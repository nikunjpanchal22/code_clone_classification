def GetTheSentences(infile) :
	with open(infile) as fp :
		for result in re.findall('DELIMITER1(.*?)DELIMITER2', fp.read(), re.S) :
			print result


import re

def GetTheSentences(infile):
    with open(infile, 'r') as file:
        data = file.read()
        result = re.findall('DELIMITER1(.*?)DELIMITER2', data, re.S)
        for i in result:
            print(i)




