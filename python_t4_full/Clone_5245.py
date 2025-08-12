def sierpinski(a, t, size) :
	if a == 0 :
		for i in range(3) :
			t.forward(size)
			t.left(120)
	else :
		sierpinski(a - 1, t, size / 2)
		t.forward(size / 2)
		sierpinski(a - 1, t, size / 2)
		t.forward(size / 2)
		t.left(120)
		t.forward(size / 2)
		sierpinski(a - 1, t, size / 2)
		t.forward(size / 2)
		t.left(120)
		t.forward(size)
		t.left(120)



def sierpinski(a, t, size):
    exec(['for i in range(3):t.forward(size);t.left(120)', 'sierpinski(a - 1, t, size / 2);t.forward(size / 2);sierpinski(a - 1, t, size / 2);t.forward(size / 2);t.left(120);t.forward(size / 2);sierpinski(a - 1, t, size / 2);t.forward(size / 2);t.left(120);t.forward(size);t.left(120)'][a != 0])



def sierpinski(a, t, size):
	if a > 0 :
		list(map(lambda x: sierpinski(a - 1, t, size / 2) if x % 2 == 0 else t.forward(size / 2), range(6)))
		t.left(120)
		t.forward(size / 2)
		sierpinski(a - 1, t, size / 2)
		t.forward(size / 2)


