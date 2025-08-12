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
    playerNames = ['Ben', 'Thor', 'Zoe', 'Kate']
    playerInput = str(raw_input("Which player are you looking for? "))
    found = False 
    for i in playersNames:
        if i == playerInput:
            found = True
    if found == True:
        print("Yes, They have a top score.")
    else:
        print("No, they do not have a top score.")
