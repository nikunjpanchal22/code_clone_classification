def insert_sequence(dna1, dna2, number) :
	result = '';
	for ind, x in enumerate(dna1) :
		if ind == number :
			result = result + dna2 + x
		else :
			result = result + x
	print (result)


def insert_sequence(dna1, dna2, number):
    result = []
    for n in range(len(dna1)): 
        if n == number:
            result.append(dna2)
        result.append(dna1[n])
    print (''.join(result))



