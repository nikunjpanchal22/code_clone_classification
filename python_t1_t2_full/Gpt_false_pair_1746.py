def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))


 def print_table(data, cols, wide):
    n, r = divmod(len(data), cols)
    pat = '{{:{}}}'.format(wide)
    line_with_cols = '\n'.join(pat * cols for _ in range(n))
    last_line = pat * r
    full_line = line_with_cols +  last_line
    print (full_line.format(*data))
