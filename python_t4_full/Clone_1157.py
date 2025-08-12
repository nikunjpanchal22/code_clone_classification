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
    output = []
    for i, char in enumerate(dna1):
        output.append(char)
        if i == number:
            output.append(dna2)
    print(''.join(output))


