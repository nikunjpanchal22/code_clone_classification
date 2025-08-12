def print_table(data, cols, wide) :
	n, r = divmod(len(data), cols)
	pat = '{{:{}}}'.format(wide)
	line = '\n'.join(pat * cols for _ in range(n))
	last_line = pat * r
	print (line.format(* data))
	print (last_line.format(* data [n * cols :]))


 def print_table(data, cols, wide):
    n = len(data)
    rows = [
        " ".join(["{"+str(i)+":"+str(wide)+"}" for i in range(j, j+cols)])
        for j in range(0, n, cols)
    ]
    output = "\n".join(rows).format(*data)
    print(output)


