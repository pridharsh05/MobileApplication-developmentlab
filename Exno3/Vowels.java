package com.example.vowels; 
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.IOException;
import android.annotation.SuppressLint; 
import android.os.Bundle;
import android.app.Activity; 
import android.view.Menu; 
import android.view.View;
import android.view.View.OnClickListener; 
import android.widget.Button;
import android.widget.EditText; 
import android.widget.Toast;
public class MainActivity extends Activity implements OnClickListener
{
EditText fname,content; Button save,count; String file_name;
String strFileContents; @SuppressLint("MissingInflatedId") @Override
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_main);
 
fname=(EditText)findViewById(R.id.editText1); 
content=(EditText)findViewById(R.id.editText2); 
save=(Button)findViewById(R.id.button1);
count=(Button)findViewById(R.id.button2); 
save.setOnClickListener(this);
count.setOnClickListener(this);
}
@SuppressLint("WrongConstant") @Override
public void onClick(View v)
{
if(v.getId()==R.id.button1)
{
FileOutputStream fos; try {
file_name=fname.getText().toString()+"hi.txt";
strFileContents = content.getText().toString();

fos = openFileOutput(file_name, MODE_PRIVATE); 
fos.write(strFileContents.getBytes());
fos.close();
Toast.makeText(getApplicationContext(), "hi.txt", 20).show();

} catch (FileNotFoundException e) {} catch (IOException e) {}
}
if(v.getId()==R.id.button2) {
String file_name = fname.getText().toString() + "h.txt"; StringBuffer sBuffer = new StringBuffer();

int count = 0; FileInputStream fis; try {
fis = openFileInput(file_name);
DataInputStream dataIO = new DataInputStream(fis); String strLine = null;
while ((strLine = dataIO.readLine()) != null) {
sBuffer.append(strLine + "\n");
}
dataIO.close(); fis.close();
for (int i = 0; i < sBuffer.length(); i++) {

switch (sBuffer.charAt(i)) { 
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
count++;
break;
}
}
Toast.makeText(getApplicationContext(), "Total Vovels Are : " + count, Toast.LENGTH_LONG).show();
} catch (FileNotFoundException e) {
} catch (IOException e) {
}
}
}
}
