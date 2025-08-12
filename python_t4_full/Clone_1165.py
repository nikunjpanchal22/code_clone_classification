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
    seq_list = list(dna1)
    seq_list.insert(number, dna2)
    print(''.join(seq_list))


