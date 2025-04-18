package io.github.sspanak.tt9.ui.main.keys;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class SoftKeyShift extends SoftKey {
	public SoftKeyShift(Context context) {
		super(context);
	}

	public SoftKeyShift(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public SoftKeyShift(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	protected boolean handleRelease() {
		return validateTT9Handler() && tt9.onKeyNextTextCase(false);
	}

	@Override
	protected String getTitle() {
		return "⇧";
	}

	@Override
	public void render() {
		setTextSize(30);
		setTypeface(Typeface.DEFAULT_BOLD);
		super.render();
		setEnabled(tt9 != null && !tt9.isVoiceInputActive() && !tt9.isInputModePhone() && !tt9.isNumericModeSigned());
	}
}
