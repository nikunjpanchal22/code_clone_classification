def read_logfile(master_log) :
	last_line_holder = []
	for line in master_log :
		if line.contains('[76:Health]:') :
			last_line_holder.append(line)
	print (last_line_holder [- 1])



def read_logfile(master_log):
    from functools import reduce
    last_line_holder = reduce(lambda acc, line: line if '[76:Health]:' in line else acc, master_log)
    print(last_line_holder)


