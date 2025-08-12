def queryset(self, request, queryset) :
	if self.value() :
		return set(comment for comment in queryset if comment.posted_by_guest())
	elif not self.value() :
		return set(comment for comment in queryset if not comment.posted_by_guest())






def queryset(self, request, queryset):
    guest_comment = self.value()
    return set(comment for comment in queryset if guest_comment is comment.posted_by_guest())





