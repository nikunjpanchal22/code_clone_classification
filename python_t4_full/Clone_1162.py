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
    front = dna1[0:number]
    back = dna1[number:]

    new_sequence = front + dna2 + back
    print(new_sequence)


