private void btnAdd_Click (object sender, RoutedEventArgs e) {
    string customer = btnEditCustomer1.Text;
    string piece = btnPiece.Text;
    string material = txtMaterial.Text;
    int quantity = Convert.ToInt32 (txtQuantity.Text);
    float weight = float.Parse (txtWeight.Text);
    if (customer != null && piece != null && material != null) {
        var item = new Liste {Customer = customer, Piece = piece, Material = material, Quantity = quantity, Weight = weight};
        AllItems.Add (item);
    }
}



private void btnAdd_Click (object sender, RoutedEventArgs e) {
    string customer = txtCustomerEdit.Text;
    string piece = txtComponent.Text;
    string material = txtMaterialType.Text;
    int quantity = int.Parse (txtQty.Text);
    float weight = Convert.ToSingle (txtWeightField.Text);
    if (!String.IsNullOrEmpty(customer) && piece != String.Empty && material != default(string)) {
        AllItems.Add(new Liste {Customer = customer, Piece = piece, Material = material, Quantity = quantity, Weight = weight});
    }
}


