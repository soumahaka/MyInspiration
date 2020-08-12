package com.example.prophetkacouphilippe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.prophetkacouphilippe.Methods.Methods;
import com.example.prophetkacouphilippe.adaptersPackage.GridviewAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    Methods methods;
    private static final String TAG=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridview);
        getSupportActionBar().setElevation(0);

        ArrayList<GridviewModelClass> gridviewModelClassArrayList =new ArrayList<>();
        methods=new Methods();
        methods.populateGridView(gridviewModelClassArrayList, MainActivity.this);
        GridviewAdapter adapter=new GridviewAdapter(MainActivity.this,gridviewModelClassArrayList);
        gridView.setAdapter(adapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int position, long id) {


                if (position==5){
                        Log.d(TAG, "Case 5");

                        AlertDialog.Builder indiaAlertBuilder = new AlertDialog.Builder(MainActivity.this);
                        indiaAlertBuilder.setTitle("Choose your language");
                        indiaAlertBuilder.setIcon(R.drawable.hindi);


                       final String[] indiaSubLanguages=new String[]{"Hindi","Kannada", "Malayalam", "Tamil" };

                        indiaAlertBuilder.setItems(indiaSubLanguages, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if (which == 0) {
                                    Toast.makeText(MainActivity.this, "you clicked " + indiaSubLanguages[0], Toast.LENGTH_SHORT).show();
                                } else if (which == 1) {
                                    Toast.makeText(MainActivity.this, "you clicked " + indiaSubLanguages[1], Toast.LENGTH_SHORT).show();
                                } else if (which == 2) {
                                    Toast.makeText(MainActivity.this, "you clicked " + indiaSubLanguages[2], Toast.LENGTH_SHORT).show();
                                } else if (which == 3) {
                                    Toast.makeText(MainActivity.this, "you clicked " + indiaSubLanguages[3], Toast.LENGTH_SHORT).show();
                                }
                            }


                        });

                        indiaAlertBuilder.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                dialogInterface.dismiss();
                            }
                        });

                        AlertDialog dialog = indiaAlertBuilder.create();
                        dialog.show();
                }

                    else if (position==15) {
                        Log.d(TAG, "Case 15");
                        AlertDialog.Builder rdcAlertBuilder = new AlertDialog.Builder(MainActivity.this);
                        rdcAlertBuilder.setTitle("Choose your language");
                        rdcAlertBuilder.setIcon(R.drawable.rdc);


                        final String[] rdcSubLanguages = new String[]{"Ligala", "Alur"};

                        rdcAlertBuilder.setItems(rdcSubLanguages, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if (which == 0) {
                                    Toast.makeText(MainActivity.this, "you clicked " + rdcSubLanguages[0], Toast.LENGTH_SHORT).show();
                                } else if (which == 1) {
                                    Toast.makeText(MainActivity.this, "you clicked " + rdcSubLanguages[1], Toast.LENGTH_SHORT).show();
                                }
                            }


                        });
                        rdcAlertBuilder.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });

                        AlertDialog rdcdialog = rdcAlertBuilder.create();
                        rdcdialog.show();
                    }

                    else if (position==21){
                        Log.d(TAG, "Case 21");
                        AlertDialog.Builder zimbabweAlertBuilder = new AlertDialog.Builder(MainActivity.this);
                        zimbabweAlertBuilder.setTitle("Choose your language");
                        zimbabweAlertBuilder.setIcon(R.drawable.zimbabwe);


                        final String[] zimbabweSubLanguages=new String[]{"Ndebele","Shona"};

                        zimbabweAlertBuilder.setItems(zimbabweSubLanguages, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if (which == 0) {
                                    Toast.makeText(MainActivity.this, "you clicked " + zimbabweSubLanguages[0], Toast.LENGTH_SHORT).show();
                                } else if (which == 1) {
                                    Toast.makeText(MainActivity.this, "you clicked " + zimbabweSubLanguages[1], Toast.LENGTH_SHORT).show();
                                }
                            }


                        });
                        zimbabweAlertBuilder.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });

                        AlertDialog zimbdialog = zimbabweAlertBuilder.create();
                        zimbdialog.show();
                    }



                    else if(position==25){
                        Log.d(TAG, "Case 25");

                        AlertDialog.Builder afriqueSudAlertBuilder = new AlertDialog.Builder(MainActivity.this);
                        afriqueSudAlertBuilder.setTitle("Choose your language");
                        afriqueSudAlertBuilder.setIcon(R.drawable.afrique_sud);


                        final String[] afriqueSudSubLanguages=new String[]{"Xhosa","Zulu", "Swati", "Sesotho" };

                        afriqueSudAlertBuilder.setItems(afriqueSudSubLanguages, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if (which == 0) {
                                    Toast.makeText(MainActivity.this, "you clicked " + afriqueSudSubLanguages[0], Toast.LENGTH_SHORT).show();
                                } else if (which == 1) {
                                    Toast.makeText(MainActivity.this, "you clicked " + afriqueSudSubLanguages[1], Toast.LENGTH_SHORT).show();
                                } else if (which == 2) {
                                    Toast.makeText(MainActivity.this, "you clicked " + afriqueSudSubLanguages[2], Toast.LENGTH_SHORT).show();
                                } else if (which == 3) {
                                    Toast.makeText(MainActivity.this, "you clicked " + afriqueSudSubLanguages[3], Toast.LENGTH_SHORT).show();
                                }
                            }


                        });
                        afriqueSudAlertBuilder.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });

                        AlertDialog afdialog = afriqueSudAlertBuilder.create();
                        afdialog.show();


                }

            }
        });

    }
}
