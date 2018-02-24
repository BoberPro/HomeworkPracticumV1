package com.example.samsung.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Country> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListAdapter(this, image_details));

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                Country country = (Country) o;
                Toast.makeText(MainActivity.this, "Selected :" + " " + country, Toast.LENGTH_LONG).show();

            }
        });
    }

    private  List<Country> getListData() {
        List<Country> list = new ArrayList<Country>();
        Country Bill = new Country("Bill Gates", "flag_united_states", 86);
        Country Warren = new Country("Warren Buffett", "flag_united_states", 75);
        Country Jeff = new Country("Jeff Bezos", "flag_united_states", 72);
        Country Amancio =new Country("Amancio Ortega","flag_spain",71);
        Country Mark =new Country("Mark Zuckerberg","flag_united_states",56);
        Country Carlos =new Country("Carlos Slim Helu","flag_mexico",54);
        Country Larry =new Country("Larry Ellison","flag_united_states",52);
        Country Charles=new Country("Charles Koch","flag_united_states",48);
        Country David=new Country("David kOCH","flag_united_states",48);
        Country Michael =new Country("Michael Bloomberg","flag_united_states",47);
        Country Bernard =new Country("Bernard Arnault","flag_france",41);
        Country Larry2 =new Country("Larry Page","flag_united_states",40);
        Country Sergey =new Country("Sergey Brin","flag_united_states",39);
        Country Liliane =new Country("Liliane Bettencourt","flag_united_states",39);
        Country Robson  =new Country("S. Robson Walton","flag_france",34);
        Country Jim =new Country("Jim Walton","flag_united_states",34);
        Country Alice =new Country("Alice Walton","flag_united_states",33);
        Country Wang =new Country("Wang Jianlin","flag_china",31);
        Country Li =new Country("Li Ka-shing","flag_hong_kong",31);
        Country Sheldon =new Country("Sheldon Adelson","flag_united_states",30);
        Country Steve =new Country("Steve Ballmer","flag_united_states",30);
        Country Jorge =new Country("Jorge Paulo Lemann","flag_brazil",29);
        Country Jack=new Country("Jack Ma","flag_china",28);
        Country BeateandKarl =new Country("Beate Heister & Karl Albrecht Jr.","flag_germany",27);
        Country David2 =new Country("David Thomson","flag_canada",27);
        Country Jacqueline =new Country("Jacqueline Mars","flag_united_states",27);
        Country John  =new Country("John Mars","flag_united_states",27);
        Country Phil =new Country("Phil Knight","flag_united_states",26);
        Country Maria =new Country("Maria Franca Fissolo","flag_italy",25);
        Country George =new Country("George Soros","flag_united_states",25);
        Country Ma =new Country("Ma Huateng","flag_china",24);




        list.add(Bill);
        list.add(Warren);
        list.add(Jeff);
        list.add(Amancio);
        list.add(Mark);
        list.add(Carlos);
        list.add(Larry);
        list.add(Charles);
        list.add(David);
        list.add(Michael);
        list.add(Larry2);
        list.add(Bernard);
        list.add(Sergey );
        list.add(Liliane);
        list.add(Robson);
        list.add(Jim );
        list.add( Alice );
        list.add( Wang);
        list.add( Li);
        list.add( Sheldon);
        list.add( Steve);
        list.add( Jorge);
        list.add( Jack);
        list.add( BeateandKarl );
        list.add( David2);
        list.add( Jacqueline);
        list.add( John);
        list.add( Phil );
        list.add( Maria );
        list.add( George );
        list.add( Ma );





        return list;
    }

}