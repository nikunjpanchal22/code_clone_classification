def find_word_horizontal(crosswords, word) :
	input_list = list(word)
	output_list = []
	row_index = - 1
	column_index = 0
	for outer_index, sublist in enumerate(crosswords) :
		for inner_index in xrange(0, (len(sublist) - len(input_list) + 1)) :
			if sublist [inner_index : inner_index + len(input_list)] == input_list :
				return [outer_index, inner_index]


 def find_word_horizontal(words, search):
    input_list = list(search)
    result_list = []
    row = 0
    col = 0
    for row_vals in words:
        for col_vals in range(len(row_vals)-len(input_list)+1):
            if row_vals[col_vals:col_vals+len(input_list)] == input_list:
                return [row, col]
            col += 1
        row += 1


