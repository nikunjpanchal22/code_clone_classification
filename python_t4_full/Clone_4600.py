def plotPerfect(df, spline) :
	ax = df.plot()
	if not spline :
		for i in ['top', 'right', 'bottom', 'left'] :
			ax.spines [i].set_visible(False)
	return (ax)


def plotPerfect(df, spline):
    ax = df.plot.scatter(x='col1', y='col2')
    if not spline:
        for side in ax.spines.keys():
            ax.spines[side].set_visible(False)
    return ax




