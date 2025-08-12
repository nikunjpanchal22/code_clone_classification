def find_word_horizontal(crosswords, word) :
	input_list = list(word)
	output_list = []
	row_index = - 1
	column_index = 0
	for outer_index, sublist in enumerate(crosswords) :
		for inner_index in xrange(0, (len(sublist) - len(input_list) + 1)) :
			if sublist [inner_index : inner_index + len(input_list)] == input_list :
				return [outer_index, inner_index]


 def find_word_horizontal(crosswords, word) :
	input_list = list(word)
	output_list = []
	row_index = -1
	column_index = 0
	for row in enumerate(crosswords):
		for i in range(len(row[1])-len(input_list)+1):
			if row[1][i:i+len(input_list)] ==  input_list:
				return [row[0], i]


