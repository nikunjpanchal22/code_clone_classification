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
        if teams_dict.get(team):
            print(teams_dict[team], team)
            print(league)
            break


