private Bitmap GetSprite (bool anim, int tsIndex, int tileIdx) {
    Rectangle cloneRect;
    string prefix = (anim) ? "A" : "S";
    using (Bitmap b = new Bitmap (prefix + tsIndex.ToString () + ".png"))
    {
        if (anim) {
            cloneRect = new Rectangle (BaseObjects.A_AnimSpriteSets [tsIndex].StaticRecs [tileIdx].X, BaseObjects.A_AnimSpriteSets [tsIndex].StaticRecs [tileIdx].Y, BaseObjects.A_AnimSpriteSets [tsIndex].RecWidth, BaseObjects.A_AnimSpriteSets [tsIndex].RecHeight);
        } else {
            cloneRect = new Rectangle (BaseObjects.A_StaticSpriteSets [tsIndex].StaticRecs [tileIdx].X, BaseObjects.A_StaticSpriteSets [tsIndex].StaticRecs [tileIdx].Y, BaseObjects.A_StaticSpriteSets [tsIndex].RecWidth, BaseObjects.A_StaticSpriteSets [tsIndex].RecHeight);
        }
        return b.Clone (cloneRect, b.PixelFormat);
    }
}


 private Bitmap GetSprite (bool anim, int tsIndex, int tileIdx) {
    string prefix = anim ? "A" : "S";
    Rectangle cloneRect;
    using (Bitmap b = new Bitmap ($"{prefix}{tsIndex}.png"))
    {
        if (anim) {
            cloneRect = GetAnimRectangle(tsIndex, tileIdx);
        } else {
            cloneRect = GetStaticRectangle(tsIndex, tileIdx);
        }
        return b.Clone (cloneRect, b.PixelFormat);
    }
}
