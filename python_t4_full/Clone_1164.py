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
    sequence_list = [dna1[i] for i in range(len(dna1))]
    sequence_list.insert(number, dna2)
    print(''.join(sequence_list))


