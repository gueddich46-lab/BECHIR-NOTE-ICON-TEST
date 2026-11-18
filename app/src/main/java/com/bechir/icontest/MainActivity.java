package com.bechir.icontest;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends Activity { @Override public void onCreate(Bundle b){super.onCreate(b); TextView t=new TextView(this); t.setText("BECHIR NOTE — ICON TEST\n\nاختبار الأيقونة فقط"); t.setTextSize(24); t.setGravity(17); setContentView(t);} }
