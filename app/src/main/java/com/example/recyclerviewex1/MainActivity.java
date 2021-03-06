package com.example.recyclerviewex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Product> listProduct = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initData();
        ProductAdapter adapter = new ProductAdapter(this,listProduct);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        RecyclerView rvProduct = findViewById(R.id.rvProduct);
        rvProduct.setLayoutManager(layoutManager);
        rvProduct.setAdapter(adapter);
    }

    private void initData() {
        listProduct.add(new Product("Product 1","500.000d",R.drawable.img));
        listProduct.add(new Product("Product 2","500.000d",R.drawable.img_1));
        listProduct.add(new Product("Product 3","500.000d",R.drawable.img_2));
        listProduct.add(new Product("Product 4","500.000d",R.drawable.img_3));
        listProduct.add(new Product("Product 5","500.000d",R.drawable.img_4));
        listProduct.add(new Product("Product 6","500.000d",R.drawable.img_5));
    }
}