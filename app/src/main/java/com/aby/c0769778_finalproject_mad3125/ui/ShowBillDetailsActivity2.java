package com.aby.c0769778_finalproject_mad3125.ui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

import com.aby.c0769778_finalproject_mad3125.R;
import com.aby.c0769778_finalproject_mad3125.adapters.BillsAdapter;
import com.aby.c0769778_finalproject_mad3125.adapters.CustomerAdapter;
import com.aby.c0769778_finalproject_mad3125.model.Customer;

import java.util.ArrayList;

public class ShowBillDetailsActivity2 extends AppCompatActivity {

    private RecyclerView rvBillsList;
    private ArrayList billsArrayList;
    private BillsAdapter billsAdapter;
    private ImageView imgAddButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_bill_details2);

        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setTitle("YOUR BILLS");

        Intent mIntent = getIntent();
        Customer customerObj = mIntent.getParcelableExtra("CustomerBills");
        billsArrayList = customerObj.getBills();

        rvBillsList = findViewById(R.id.rvBillsList);
        billsAdapter = new BillsAdapter(billsArrayList);

        RecyclerView.LayoutManager mLinearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        rvBillsList.setLayoutManager(mLinearLayoutManager);
        rvBillsList.setAdapter(billsAdapter);

        imgAddButton = findViewById(R.id.imgAddBill);
        imgAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(ShowBillDetailsActivity2.this, AddNewBillActivity.class);
                startActivity(mIntent);
            }
        });

    }
}
