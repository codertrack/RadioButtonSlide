package session.radiobuttonslide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {


	private RadioGroup mRadioGroup;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mRadioGroup = (RadioGroup) findViewById(R.id.rg);

		((RadioButton)mRadioGroup.getChildAt(0)).setChecked(true);

	}
}
