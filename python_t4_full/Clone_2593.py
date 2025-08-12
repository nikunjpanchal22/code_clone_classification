def standings(team) :
	for league, teams_dict in teams.items() :
		try :
			teams_dict [team]
			print (teams_dict [team], team)
			print (league)
			break
		except KeyError :
			continue



 def standings(team) :
	for league, teams_dict in teams.items() :
		if team not in teams_dict :
			pass
		else :
			print (teams_dict [team], team)
			print (league)


