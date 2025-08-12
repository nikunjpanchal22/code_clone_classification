def insert_sequence(dna1, dna2, number) :
	result = '';
	for ind, x in enumerate(dna1) :
		if ind == number :
			result = result + dna2 + x
		else :
			result = result + x
	print (result)


def insert_sequence(dna1, dna2, number):
    s = list(dna1) 
    s.insert(number, dna2) 
    res = ''.join(s) 
    print(res) 



