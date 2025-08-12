def trans(transition, input, final, state) :
	for each in transition [state] [int(input [0])] :
		if each < 4 :
			state = each
			if len(input) == 1 :
				if (str(state) in final) :
					print ("accepted")
					sys.exit()
				else :
					continue
			trans(transition, input [1 :], final, state)


 def trans(transition,input,final,state):
  if (len(input)==0):
    if(str(state) in final):
      print("accepted")
      sys.exit()
    else:
      continue
  else:
    for each in transition[state][int(input[0])]:
      if each<4:
        state = each
        trans(transition,input[1:],final,state)
      


