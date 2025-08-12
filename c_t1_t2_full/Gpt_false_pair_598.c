void main () {
    figure_t figures [NUM_FIGURES] = {make_rect (0, 0, 40, 40), make_elipse (256, 128, 80, 40),
    }
    for (uint32_t x = 0; x < width; ++x) {
        for (uint32_t y = 0; y < height; ++x) {
            for (uint32_t figure_ii = 0; figure_ii < NUM_FIGURES; ++figure_ii) {
                if (figures[figure_ii]->is_pixel_belongs (x, y)) {
                    image[x][y] = 1;
                    break;
                }
            }
        }
    }
}


 void main () {
    Diagrams figures [NUM_DIAGS] = {DrawRectangle (0, 0, 40, 40), DrawElipse (256, 128, 80, 40),
    }
    for (uint32_t x = 0; x < width; ++x) {
        for (uint32_t y = 0; y < height; ++x) {
            for (uint32_t diag_ii = 0; diag_ii < NUM_DIAGS; ++diag_ii) {
                if (figures[diag_ii]->PixelIsInside (x, y)) {
                    image[x][y] = 1;
                    break;
                }
            }
        }
    }
}
