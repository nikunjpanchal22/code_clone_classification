def plotPerfect(df, spline) :
	ax = df.plot()
	if not spline :
		for i in ['top', 'right', 'bottom', 'left'] :
			ax.spines [i].set_visible(False)
	return (ax)





def plotPerfect(df, spline):
    ax = df.plot.hist()
    if not spline:
        [ax.spines[side].set_visible(False) for side in ['top', 'right', 'bottom', 'left']]


