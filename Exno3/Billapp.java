package com.example.billapp;
import androidx.appcompat.app.AppCompatActivity; import android.os.Bundle;
import android.widget.Button; import android.widget.CheckBox; import android.widget.EditText; import android.widget.RadioButton; import android.view.View;
import android.widget.RadioGroup; import android.widget.Toast;
public class MainActivity extends AppCompatActivity{ Button submit;
CheckBox chips,cakes,cookies,burgers; RadioButton modes;
RadioGroup modepay; @Override
protected void onCreate(Bundle savedInstanceState){ super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);

 
addListenerOnButton();
}
public void addListenerOnButton(){ 
  submit=(Button)findViewById(R.id.b1); 
                                  
  modepay=(RadioGroup)findViewById(R.id.mode); 
  chips=(CheckBox)findViewById(R.id.chips1);
  cakes=(CheckBox)findViewById(R.id.cake1); 
  cookies=(CheckBox)findViewById(R.id.cookie1); burgers=(CheckBox)findViewById(R.id.burger1);
final EditText numbur=findViewById(R.id.numofburger); 
  final EditText numcake=findViewById(R.id.numofcake); 
  final EditText numcookie=findViewById(R.id.numofcookies); 
  final EditText numchip=findViewById(R.id.numofchip); 
  submit.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View view){
int selectedId=modepay.getCheckedRadioButtonId();
  modes=(RadioButton)findViewById(selectedId);
int total=0;
StringBuilder result=new StringBuilder(); 
  if(chips.isChecked()){
int n1=Integer.parseInt(numchip.getText().toString()); 
    total+=n1*30;
}
if(cakes.isChecked()){
int n2=Integer.parseInt(numcake.getText().toString()); total+=n2*50;
}
if(cookies.isChecked()){
int n3=Integer.parseInt(numcookie.getText().toString()); total+=n3*100;
}
if(burgers.isChecked()){
int n4=Integer.parseInt(numbur.getText().toString()); total+=n4*150;
}
result.append("\nWelcome!!!"); result.append("\nTotal:"+total+"Rs"); result.append("\nyourmodeofpaymentis:"+modes.getText());

Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
}
});
}


