package com.example.androidtest

import android.app.ListActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.{ ArrayAdapter, TextView, Toast }
import android.view.View


class ListLayoutActivity extends ListActivity {
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)

    val countries = getResources().getStringArray(R.array.countries_array)
    setListAdapter(new ArrayAdapter[String](this, R.layout.list_item, countries))

    val lv = getListView()
    lv.setTextFilterEnabled(true)

    lv.setOnItemClickListener(new OnItemClickListener() {
      override def onItemClick(parent: AdapterView[_], view: View, position: Int, id: Long) {
        Toast.makeText(
          getApplicationContext(),
          view.asInstanceOf[TextView].getText(),
          Toast.LENGTH_SHORT
        ).show()
      }
    })
  }
}
