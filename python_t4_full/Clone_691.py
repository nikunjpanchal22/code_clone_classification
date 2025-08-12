def find_word_horizontal(crosswords, word) :
	input_list = list(word)
	output_list = []
	row_index = - 1
	column_index = 0
	for outer_index, sublist in enumerate(crosswords) :
		for inner_index in xrange(0, (len(sublist) - len(input_list) + 1)) :
			if sublist [inner_index : inner_index + len(input_list)] == input_list :
				return [outer_index, inner_index]


 def find_word_horizontal(crosswords,word):
    input_word = list(word)
    output_word = []
    row = 0
    column = 0
    for search_row in crosswords:
        for search_column in range(len(search_row) - len(input_word) +1):
            if(search_row[search_column : search_column + len(input_word)] == input_word):
                return [row,search_column]
            column += 1
        row += 1


