def plotPerfect(df, spline) :
	ax = df.plot()
	if not spline :
		for i in ['top', 'right', 'bottom', 'left'] :
			ax.spines [i].set_visible(False)
	return (ax)


 def plotPerfect(df,spline):
    plot_fig,ax = plt.subplots()
    df.plot(ax=ax)
    if spline == False:
        for i in ['top','right','bottom','left']:
            ax.spines[i].set_visible(False)
    return ax 



