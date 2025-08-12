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
    input = list(word)
    output = []
    row = 0
    column = 0
    for searchRow in crosswords:
        for searchCol in range(len(searchRow)-len(input)+1):
            if searchRow[searchCol:searchCol+len(input)] == input:
                return [row,column]
            column += 1
        row += 1


