def insert_sequence(dna1, dna2, number) :
	result = '';
	for ind, x in enumerate(dna1) :
		if ind == number :
			result = result + dna2 + x
		else :
			result = result + x
	print (result)


 

def insert_sequence(dna1, dna2, number):
    result = list(dna1)
    result[number] = dna2 + dna1[number]
    print(''.join(result))



