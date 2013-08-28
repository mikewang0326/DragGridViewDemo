package com.mike.draggridview.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.mike.draggridview.demo.widget.DraggableGridView;

public class MainActivity extends Activity implements OnClickListener {

	private DraggableGridView mUpDragGridView;
	private DraggableGridView mBottomDragGridView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mUpDragGridView = (DraggableGridView) findViewById(R.id.drag_grid_view_up);
		mBottomDragGridView = (DraggableGridView) findViewById(R.id.drag_grid_view_bottom);
		
		Button btnAddView = (Button) findViewById(R.id.btn_add_view);
		btnAddView.setOnClickListener(this);
		
		
		
		
		
	}

	@Override
	public void onClick(View v) {
		TextView tv = new TextView(this);
		tv.setText("Hello world!");
		tv.setBackgroundColor(0xffff0000);
		tv.setGravity(Gravity.CENTER);
		mUpDragGridView.addView(tv);
	}

}
