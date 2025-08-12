def insert_sequence(dna1, dna2, number) :
	result = '';
	for ind, x in enumerate(dna1) :
		if ind == number :
			result = result + dna2 + x
		else :
			result = result + x
	print (result)


def insert_sequence(dna1, dna2, number):
    result = ''
    for i in range(len(dna1)):
        if i == number:
            result += dna2 + dna1[i]
        else:
            result += dna1[i]
    print(result)
    


