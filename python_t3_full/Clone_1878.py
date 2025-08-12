def read_logfile(master_log) :
	last_line_holder = []
	for line in master_log :
		if line.contains('[76:Health]:') :
			last_line_holder.append(line)
	print (last_line_holder [- 1])



 def read_logfile(master_log) :
    last_line_holder = []
    # iterate over each line in master log
    for line in master_log:
    # if substring "126:Health]:" is in the line
        if "[76:Health]:" in line.lower():
            last_line_holder.append(line)
    # print out last element in the list


