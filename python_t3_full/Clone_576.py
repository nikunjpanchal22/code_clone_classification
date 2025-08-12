def find_word_horizontal(crosswords, word) :
	input_list = list(word)
	output_list = []
	row_index = - 1
	column_index = 0
	for outer_index, sublist in enumerate(crosswords) :
		for inner_index in xrange(0, (len(sublist) - len(input_list) + 1)) :
			if sublist [inner_index : inner_index + len(input_list)] == input_list :
				return [outer_index, inner_index]


 def find_word_horizontal(crosswords, word):
    search_word = list(word)
    output_word = []
    row_index = 0
    column_index = 0
    for row,line in enumerate(crosswords):
        for col in range(len(line)-len(search_word)+1):
            if line[col:col+len(search_word)] == search_word:
                return [row_index, column_index]
            column_index += 1
        row_index += 1


