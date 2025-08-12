def Names() :
	names_list = ['Ben', 'Thor', 'Zoe', 'Kate']
	Found = False
	PlayerName = str(raw_input("What Player are you looking for? "))
	for name in names_list :
		if name == PlayerName :
			Found = True
	if Found == True :
		print ("Yes, they have a top score.")
	else :
		print ("No, they do not have a top score.")


 def Names():
    givenList = ['Ben', 'Thor', 'Zoe', 'Kate']
    givenInput = str(raw_input("Which player are you looking for? "))
    isPresentInList = False 
    for check in givenList:
        if check == givenInput:
            isPresentInList = True
    if isPresentInList == True:
        print("Yes, they have a top score.")
    else:
        print("No, they do not have a top score.")
