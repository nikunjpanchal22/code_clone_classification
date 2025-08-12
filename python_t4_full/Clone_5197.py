def test() :
	fn = 'users.txt.txt'
	f = open(fn)
	output = []
	changeuser = 'peterpeter'
	userinfo = 'HeIsTall'
	for line in f :
		if line.strip().split(':') [0] ! = changeuser :
			output.append(line)
		else :
			output.append(changeuser + ":" + userinfo + "\n")
	f.close()
	f = open(fn, 'w')
	f.writelines(output)
	f.close()


        for line in lines:
            file.write(line) if line.strip().split(':')[0] != 'peterpeter' else file.write('peterpeter:HeIsTall\n')




def test() :
    with open('users.txt.txt', 'r+') as file:
        lines = file.readlines()


