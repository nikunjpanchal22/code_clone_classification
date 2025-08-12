def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))


 def print_table(data, cols, wide):
    rows, remainder = divmod(len(data), cols)
    template = f"{{:{wide}}} " * cols
    line_template = template * rows + template[:remainder]
    print(line_template.format(*data))


