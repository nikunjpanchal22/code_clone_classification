def func(ax, data, color, position) :
	ax.plot(data [0], data [1], color = color)
	ax.spines [position].set_color(color)
	for pos in ['left', 'right'] :
		if pos ! = position :
			ax.spines [pos].set_visible(False)




def func(ax, data, color, position) :
	ax.plot(data [0], data [2], color = color)
	ax.spines [position].set_color(color)
	for pos in ['top', 'bottom'] :
		if pos ! = position :
			ax.spines [pos].set_visible(False)
