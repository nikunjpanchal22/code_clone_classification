def insert_sequence(dna1, dna2, number) :
	index = 0
	result = ''
	for character in dna1 :
		if index == number :
			result = result + dna2
		result = result + character
		index += 1
	print (result)




def insert_sequence(dna1, dna2, number):
	result = ''
	i = 0
	for c in dna1:
		if i == number:
			result = result + dna2
		result = result + c
		i += 1
	print(result)
