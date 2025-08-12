def plotPerfect(df, spline) :
	ax = df.plot()
	if not spline :
		for i in ['top', 'right', 'bottom', 'left'] :
			ax.spines [i].set_visible(False)
	return (ax)


 def plotPerfect(df, spline) :
    ax = df.plot()
    if not spline:
        for sp in ['top', 'right', 'bottom', 'left']:
            ax.spines[sp].set_visible(False)
    return ax

