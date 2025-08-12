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
    input_list = list(word)
    output_list = [] 
    row_index = 0
    for row in crosswords:
        col_offset = 0
        for c in row:
            block_match = row[col_offset:col_offset+len(input_list)]
            if block_match == input_list:
                return [row_index, col_offset]
            col_offset += 1
        row_index += 1


