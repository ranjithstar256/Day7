package ran.am.day7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void inb(View view) {
        Toast.makeText(this, "inb", Toast.LENGTH_SHORT).show();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frid,new BlankFragment()).commit();
    }

    public void sen(View view) {
        Toast.makeText(this, "sen", Toast.LENGTH_SHORT).show();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frid,new BlankFragment2()).commit();
    }

    public void outb(View view) {
        Toast.makeText(this, "outb", Toast.LENGTH_SHORT).show();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frid,new BlankFragment3()).commit();
    }


}