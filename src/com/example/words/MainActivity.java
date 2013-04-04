package com.example.words;
import java.util.List;

import net.tsz.afinal.FinalDb;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends Activity {
	
	
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        
        
        EditText spell=(EditText)findViewById(R.id.spell);
        EditText pronoun=(EditText)findViewById(R.id.pronoun);
        EditText meaning=(EditText)findViewById(R.id.meaning);
        Button button=(Button)findViewById(R.id.confirm);
        String spellString=spell.getText().toString();
    	String pronounString=pronoun.getText().toString();
    	String meaningString=meaning.getText().toString();
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		} )
        
    	
        FinalDb db=FinalDb.create(this);
        word words_add=new word();
        words_add.setSpell(spellString);
        words_add.setPronoun(pronounString);
        words_add.setMeaning(meaningString);
        db.save(words_add);
        List<word> wordsList=db.findAll(word.class);
        
    	
    }


   
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
