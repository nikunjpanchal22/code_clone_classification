def standings(team) :
	for league, teams_dict in teams.items() :
		try :
			teams_dict [team]
			print (teams_dict [team], team)
			print (league)
			break
		except KeyError :
			continue






def standings(team):
    for league, teams_dict in teams.items():
        result = teams_dict.get(team, None)
        if result:
            print(result, team)


