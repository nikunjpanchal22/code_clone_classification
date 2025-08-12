def checkLen() :
	days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
	if "Monday" in days :
		print("found")
		print (days.index("Monday"))


 def checkLen() :
    i = 0
    list_len = len(days)
    found = False
    while i < list_len:
        if days[i] == "Monday":
            found = True
            break
        i+=1
    if found == True:
        print("found")
        print(i)


