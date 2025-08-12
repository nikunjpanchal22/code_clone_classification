def func(ax, data, color, position) :
	ax.plot(data [0], data [1], color = color)
	ax.spines [position].set_color(color)
	for pos in ['left', 'right'] :
		if pos ! = position :
			ax.spines [pos].set_visible(False)


 def func(ax, data, color, position) :
    ax.plot(data[0], data[1], color=color, linewidth=2, zorder=1)
    ax.spines[position].set_color(color)
    for pos in ['left', 'right', 'top', 'bottom']:
        if pos != position:
            ax.spines[pos].set_color('white')


