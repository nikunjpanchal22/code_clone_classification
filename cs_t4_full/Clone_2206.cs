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
    string customer = txtCustomer.Text;
    int quantity = Int32.Parse(nbxQuantity.Text);
    string material = txtMat.Text;
    float weight = Single.Parse (txtWt.Text);
    string piece = txtPiece.Text;
    if (String.IsNullOrWhiteSpace(customer) == false && piece != "" && material.Length > 0) {
        AllItems.Add (new Liste {Customer = customer, Piece = piece, Material = material, Quantity = quantity, Weight = weight});
    }
}


