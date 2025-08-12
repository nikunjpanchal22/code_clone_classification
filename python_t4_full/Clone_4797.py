def queryset(self, request, queryset) :
	if self.value() :
		return set(comment for comment in queryset if comment.posted_by_guest())
	elif not self.value() :
		return set(comment for comment in queryset if not comment.posted_by_guest())




def queryset(self, request, queryset):
    comments_set = set()
    if self.value():
        for comment in queryset:
            if comment.posted_by_guest():
                comments_set.add(comment)
    else:
        for comment in queryset:
            if not comment.posted_by_guest():
                comments_set.add(comment)
    return comments_set


