package devarthur.post.post.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import devarthur.post.post.R;

//SHOW Details about the product, like its image in a larger scale.

public class ProductDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        getSupportActionBar().hide();
    }
}
