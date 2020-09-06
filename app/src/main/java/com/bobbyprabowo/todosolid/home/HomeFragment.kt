package com.bobbyprabowo.todosolid.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.bobbyprabowo.todosolid.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_main) {

    private val viewModel: HomeViewModel by viewModels()

    private lateinit var todoListAdapter: TodoListAdapter

    @Inject
    lateinit var viewHolderFactory: TodoViewHolderFactory

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        todoListAdapter = TodoListAdapter(viewHolderFactory)
        todoRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        todoRecyclerView.adapter = todoListAdapter
    }

    override fun onStart() {
        super.onStart()
        viewModel.getItems().subscribe({
            todoListAdapter.submitList(it)
        }, {

        })
    }
}
