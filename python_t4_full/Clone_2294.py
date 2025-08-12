def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))


 def print_table(data, cols, wide):
    n = len(data)
    mod = n % cols
    rownums = n//cols
    pat = '{{:{}}}'.format(wide)
    lines = ''
    for i in range(rownums):
        for k in range(i*cols,(i+1)*cols):
            lines += pat
        lines += "\n"
    for j in range(mod):
        lines += pat
    print(lines.format(*data))


