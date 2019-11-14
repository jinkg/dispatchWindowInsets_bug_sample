package com.kinglloy.windowinsets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * Yalin on 2019-11-13
 */
class ListFragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.layout_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val items = arrayListOf<Int>()
        for (i in 0..100) {
            items.add(i)
        }
        val list = view.findViewById<RecyclerView>(R.id.list)
        list.layoutManager = LinearLayoutManager(context)
        list.adapter = MainActivity.Adapter(items, R.layout.layout_item1)

        view.findViewById<View>(R.id.refresh).setOnClickListener {
            items.shuffle()
            list.adapter?.notifyDataSetChanged()
        }
    }
}
