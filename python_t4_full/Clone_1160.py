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
    head = dna1[:number] 
    tail = dna1[number:] 
    new_sequence = head + dna2 + tail
    print(new_sequence)


