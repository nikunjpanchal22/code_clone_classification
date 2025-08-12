def standings(team) :
	for league, teams_dict in teams.items() :
		try :
			teams_dict [team]
			print (teams_dict [team], team)
			print (league)
			break
		except KeyError :
			continue


#gpt output=============
 def standings(team) :
	for league, teams_dict in teams.items() :
		if team in teams_dict :
			print (teams_dict [team], team)
			print (league)
			break


