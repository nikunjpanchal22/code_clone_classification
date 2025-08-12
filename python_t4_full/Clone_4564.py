def text(ctx, string, pos, theta = 0.0, face = 'Georgia', font_size = 18) :
	ctx.save()
	ctx.select_font_face(face, cairo.FONT_SLANT_NORMAL, cairo.FONT_WEIGHT_NORMAL)
	ctx.set_font_size(font_size)
	fascent, fdescent, fheight, fxadvance, fyadvance = ctx.font_extents()
	x_off, y_off, tw, th = ctx.text_extents(string) [: 4]
	nx = - tw / 2.0
	ny = fheight / 2
	ctx.translate(pos [0], pos [1])
	ctx.rotate(theta)
	ctx.translate(nx, ny)
	ctx.move_to(0, 0)
	ctx.show_text(string)
	ctx.restore()


    contxt.rotate(theta)
    contxt.translate(new_x, new_y)
    contxt.move_to(0, 0)
    contxt.show_text(txt)
    contxt.restore()


def set_text(cntxt, txt, pos, rot = 0.0, fnt = 'Georgia', sz = 18):
    cntxt.save()
    cntxt.select_font_face(fnt, cairo.FONT_SLANT_NORMAL, cairo.FONT_WEIGHT_NORMAL)
    cntxt.set_font_size(sz)
    f_asc, f_dsc, f_hgt, fx_adv, fy_adv = cntxt.font_extents()
    x_offset, y_offset, txt_wdth, txt_hgt = cntxt.text_extents(txt)[:4]
    new_x = - txt_wdth / 2.0


