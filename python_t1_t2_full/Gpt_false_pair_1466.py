def plotPerfect(df, spline) :
	ax = df.plot()
	if not spline :
		for i in ['top', 'right', 'bottom', 'left'] :
			ax.spines [i].set_visible(False)
	return (ax)


 def plotPerfect(df, spline):
    plot_data = df.plot()
    if not spline:
        for i in ['top', 'right', 'bottom', 'left']:
            plot_data.spines[i].set_visible(False)
    return plot_data 

