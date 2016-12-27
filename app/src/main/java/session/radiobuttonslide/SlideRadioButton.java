package session.radiobuttonslide;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import java.util.MissingResourceException;

/**
 * Created by wukai on 2016/12/27.
 */

public class SlideRadioButton extends RadioButton {

	private Paint mPaint ;

	public SlideRadioButton(Context context) {
		super(context);
		init();
	}

	public SlideRadioButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public SlideRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init();
	}

	private void init(){
		mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		mPaint.setColor(Color.RED);

		//监听选中 重新绘制view
		setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				invalidate();
			}
		});
	}

	private Rect mRect;

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

		if (mRect == null){
			mRect = new Rect(0,0,10,getMeasuredHeight());
		}
		//如果当前是选中装填画笔设置为红色 否则就是透明色
		if (isChecked()){
			mPaint.setColor(Color.RED);
		}else {
			mPaint.setColor(Color.TRANSPARENT);
		}
		canvas.drawRect(mRect,mPaint);
	}
}
