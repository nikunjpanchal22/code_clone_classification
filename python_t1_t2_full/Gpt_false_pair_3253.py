def game_intro() :
	intro = True
	while intro :
		for event in pygame.event.get() :
			if event.type == pygame.QUIT :
				quit()
			mouse = pygame.mouse.get_pos()
			if 150 + 100 > mouse [0] > 150 and 430 + 50 > mouse [1] > 430 :
				pygame.draw.rect(gameDisplay, bright_green, (150, 430, 100, 50))
			else :
				pygame.draw.rect(gameDisplay, green, (150, 430, 100, 50))




def game_intro():
	intro = True
	while intro:
		for event in pygame.event.get():
			if event.type == pygame.QUIT:
				quit()
			mouse = pygame.mouse.get_pos()
			if 250 + 100 > mouse[0] > 250 and 430 + 50 > mouse[1] > 430:
				pygame.draw.rect(gameDisplay, bright_green, (250, 430, 100, 50))
			else:
				pygame.draw.rect(gameDisplay, green, (250, 430, 100, 50))

