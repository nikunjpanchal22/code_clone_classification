def plotPerfect(df, spline) :
	ax = df.plot()
	if not spline :
		for i in ['top', 'right', 'bottom', 'left'] :
			ax.spines [i].set_visible(False)
	return (ax)


 def plotPerfect(df, spline) :
    plt = df.plot()
    if spline == False :
        for value in ['top','right','bottom','left'] :
            plt.spines[value].set_visible(False)
    return plt



