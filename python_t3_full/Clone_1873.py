def read_logfile(master_log) :
	last_line_holder = []
	for line in master_log :
		if line.contains('[76:Health]:') :
			last_line_holder.append(line)
	print (last_line_holder [- 1])



 def read_logfile(master_log) :
    last_line_holder = []
    # open file and read in each line
    with open(master_log) as f:
        # iterate through each line
        for line in f:
            # if substring "126:Health]:" is in the line
            if "[76:Health]:" in line:
                # add it to the list
                last_line_holder.append(line)

    # print out last element in the list


