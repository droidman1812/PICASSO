package picassoapp.test.com.picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.txtnombre)TextView nombre;

    @BindView(R.id.txtdescripcion)TextView descripcion;
    ImageView img,img2;
     //TextView H1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
     // H1=(TextView) findViewById(R.id.txtnombre);


        img=(ImageView)findViewById(R.id.imageView);
                Picasso.with(this)
                        .load("https://www.viajejet.com/wp-content/viajes/Lago-Moraine-Parque-Nacional-Banff-Alberta-Canada.jpg")
                        .resize(1000, 1000)
                        .centerCrop()
                        .into(img);
        img2=(ImageView)findViewById(R.id.imageView1);
        Picasso.with(this)
                .load("https://www.viajejet.com/wp-content/viajes/una-laguna-unica-en-jamaica.jpg")
                .resize(1000, 1000)
                .centerCrop()
                .into(img2);


    }

    public  void mostrar(View view){


        Toast.makeText(this,"Bienvenido a ver el paisaje ",Toast.LENGTH_LONG).show();


    }

    }




