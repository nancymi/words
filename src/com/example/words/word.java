package com.example.words;

import android.R.id;

public class word {
		
		private String spell;
		private String pronoun;
		private String meaning;
		private int id;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSpell() {
			return spell;
		}
		public void setSpell(String spell) {
			this.spell = spell;
		}
		public String getPronoun() {
			return pronoun;
		}
		public void setPronoun(String pronoun) {
			this.pronoun = pronoun;
		}
		public String getMeaning() {
			return meaning;
		}
		public void setMeaning(String meaning) {
			this.meaning = meaning;
		}
		
}
