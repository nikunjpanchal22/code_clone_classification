def trans(transition, input, final, state) :
	for each in transition [state] [int(input [0])] :
		if each < 4 :
			state = each
			if len(input) == 1 :
				if (str(state) in final) :
					print "accepted"
					sys.exit()
				else :
					continue
			trans(transition, input [1 :], final, state)




def check(transition, input_data, final, state):
	for each in transition [state] [int(input_data [0])] :
		if each < 4:
			state = each
			if len(input_data) == 1 :
				if str(state) in final:
					print  "accepted"
					sys.exit()
				else :
					continue
			check(transition, input_data [1 :], final, state)
