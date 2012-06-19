package com.robo.dojo.test;

import com.jayway.android.robotium.solo.Solo;
import com.robo.dojo.RobotiumTestsActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

public class MainActivityTests extends
		ActivityInstrumentationTestCase2<RobotiumTestsActivity> {

	private Solo solo;

	public MainActivityTests() {
		super("com.robo.dojo", RobotiumTestsActivity.class);
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	public void testShouldClean() {
		solo.clickOnButton("Clean");
		EditText text = solo.getEditText(0);
		assertTrue(text.getText().toString().equals(""));
	}
	
	public void testShouldFill() {
		solo.clickOnButton("Clean");
		solo.clickOnButton("Fill");
		EditText text = solo.getEditText(0);
		assertTrue(text.getText().toString().equals("Write something here"));
	}

}
