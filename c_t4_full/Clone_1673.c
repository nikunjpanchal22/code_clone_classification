int main () {
    Vector4f position, normal, color;
    position.x = 12.3f;
    position.y = 2.f;
    position.z = 3.f;
    position.w = 1.f;
    normal.x = .8f;
    normal.y = .9f;
    normal.z = .1f;
    normal.w = 1.f;
    color.r = 1.f;
    color.g = .233f;
    color.b = 2.11f;
    color.a = 1.1f;
    return 0;
}




int main () {
    Vector4f position, normal, color;

    position = Vector4f(12.3f, 2.f, 3.f, 1.f);
    normal = Vector4f(.8f, .9f, .1f, 1.f);
    color = Vector4f(1.f, .233f, 2.11f, 1.1f);
    
    return 0;
}


