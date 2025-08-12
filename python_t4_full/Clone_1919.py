def plotPerfect(df, spline) :
	ax = df.plot()
	if not spline :
		for i in ['top', 'right', 'bottom', 'left'] :
			ax.spines [i].set_visible(False)
	return (ax)


 def plotPerfect(df, spline) :
    f, ax = plt.subplots(1)
    df.plot(ax=ax)
    if spline == False:
        for edge in ['top','right','bottom','left']:
            ax.spines[edge].set_visible(False)
    return ax



