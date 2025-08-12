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
    output = ''
    for i in range(0, len(dna1)):
        if i == number:
            output += dna2
        output += dna1[i]
    print(output)


