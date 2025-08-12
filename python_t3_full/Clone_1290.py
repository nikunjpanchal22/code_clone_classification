def plotPerfect(df, spline) :
	ax = df.plot()
	if not spline :
		for i in ['top', 'right', 'bottom', 'left'] :
			ax.spines [i].set_visible(False)
	return (ax)


 def plotPerfect(df, spline) :
    new_axes = df.plot()
    if spline == False:
        for axis in ['top', 'right', 'bottom', 'left']:
            new_axes.spines[axis].set_visible(False)
    return new_axes



