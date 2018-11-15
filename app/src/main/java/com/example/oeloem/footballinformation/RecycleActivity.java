package com.example.oeloem.footballinformation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    @BindView(R.id.my_recyler_view)
    RecyclerView myRecylerView;

    String[] namaClub, detailClub;
    int[] gambarClub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        namaClub = getResources().getStringArray(R.array.club_name);
        detailClub = getResources().getStringArray(R.array.club_detail);
        gambarClub = new int[]{R.drawable.img_barca, R.drawable.img_madrid, R.drawable.img_bayern, R.drawable.img_city,
                R.drawable.img_mu, R.drawable.img_chelsea, R.drawable.img_acm, R.drawable.img_arsenal};

        Adapter adapter = new Adapter(RecycleActivity.this, gambarClub,namaClub, detailClub);

        myRecylerView.setHasFixedSize(true);
        myRecylerView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        myRecylerView.setAdapter(adapter);
    }
}

