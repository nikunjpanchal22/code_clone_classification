def __init__(self, guide, * args, ** kwargs) :
	self.guide = guide
	super(ChecklistForm, self).__init__(* args, ** kwargs)
	new_fields = OrderedDict()
	for tier, tasks in guide.tiers().items() :
		questions = [(t ['task'], t ['question']) for t in tasks if 'question' in t]
		new_fields [tier.lower()] = forms.MultipleChoiceField(
		label = tier,
		widget = forms.CheckboxSelectMultiple(),
		choices = questions,
		help_text = 'desired set of site features')
	new_fields ['name'] = self.fields ['name']
	new_fields ['email'] = self.fields ['email']
	new_fields ['website'] = self.fields ['website']
	self.fields = new_fields


    def __init__(self, guide, *args, **kwargs):
        super(ChecklistForm, self).__init__(*args, **kwargs)
        self.guide = guide

        self.fields['name'] = self.fields.pop('name')
        self.fields['email'] = self.fields.pop('email')
        self.fields['website'] = self.fields.pop('website')

        for tier, tasks in guide.tiers().items():
            questions = [(task['task'], task['question']) for task in tasks
                         if 'question' in task]
            field = forms.MultipleChoiceField(label=tier,
                                              widget=forms.CheckboxSelectMultiple(),
                                              choices=questions,
                                              help_text="Desired set of site features")
            self.fields[tier.lower()] = field


