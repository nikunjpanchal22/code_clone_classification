def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))


 def print_table(data, cols, wide):
    num_rows, remainder = divmod(len(data), cols)
    template = '{{:{}}}' * cols
    row_template = template * num_rows + template[:remainder]
    output = row_template.format(*data)
    print(output)


