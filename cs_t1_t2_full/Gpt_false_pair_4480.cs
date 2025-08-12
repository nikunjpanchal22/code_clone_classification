public static MvcHtmlString EnumDropDownListFor < TModel, TEnum > (this HtmlHelper < TModel > htmlHelper, Expression < Func < TModel, TEnum > > expression, object htmlAttributes) {
    ModelMetadata metadata = ModelMetadata.FromLambdaExpression (expression, htmlHelper.ViewData);
    Type enumType = GetNonNullableModelType (metadata);
    IEnumerable < TEnum > values = Enum.GetValues (enumType).Cast < TEnum > ();
    IEnumerable < SelectListItem > items = from value in values
        select new SelectListItem {Text = GetEnumDescription (value), Value = value.ToString (), Selected = value.Equals (metadata.Model)};
    if (metadata.IsNullableValueType)
        items = SingleEmptyItem.Concat (items);
    return htmlHelper.DropDownListFor (expression, items, htmlAttributes);
}


public static MvcHtmlString EnumDropDownListFor < TModel, TEnum > (this HtmlHelper < TModel > htmlHelper, Expression < Func < TModel, TEnum > > expression, object htmlAttributes) {
    ModelMetadata metadata = ModelMetadata.FromLambdaExpression (expression, htmlHelper.ViewData);
    Type enumType = GetNonNullableModelType (metadata);
    IEnumerable < TEnum > values = Enum.GetValues (enumType) as IEnumerable<TEnum>;
    IEnumerable < SelectListItem > items = from value in values
        select new SelectListItem { Text = GetEnumDescription (value), Value = value.ToString (), Selected = value.Equals (metadata.Model) };
    if (metadata.IsNullableValueType)
        items = SingleEmptyItem.Concat (items);
    return htmlHelper.DropDownListFor (expression, items, htmlAttributes);
}
