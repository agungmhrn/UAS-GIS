package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    TextView dtlnama,dtlalamat,dtltelpn;
    Button call;
    ImageView dtlgambar;
    public static String id, nama, alamat, telpn, gambar;
    public static Double latitude, longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        dtlnama=findViewById(R.id.tv_nama);
        dtlalamat=findViewById(R.id.tv_alamat);
        dtltelpn=findViewById(R.id.tv_telpn);
        call=findViewById(R.id.bt_call);
        dtlgambar=findViewById(R.id.img_data);

        dtlnama.setText(nama);
        dtlalamat.setText(alamat);
        dtltelpn.setText(telpn);
        Picasso.get().load(gambar).into(dtlgambar);

        call.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent calling = new Intent(Intent.ACTION_DIAL, Uri.parse("tlpn:"+telpn));
        startActivity(calling);
    }
}
