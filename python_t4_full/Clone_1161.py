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
    first_part = dna1[:number]
    last_part = dna1[number:]
    result = first_part + dna2 + last_part
    print(result)


