def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))


 def print_table(data, cols, wide):
    row_number = len(data)//cols
    mod = len(data)%cols
    pattern = '{{:{}}}'.format(wide)
    lines = ""

    for i in range(0, row_number):
        for j in range(i*cols, (i+1)*cols):
            lines += pattern
        lines += '\n'

    for i in range (mod):
        lines += pattern

    print (lines.format(*data))


