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
    result = dna1[0:number] + dna2 + dna1[number:len(dna1)]
    print(result)


