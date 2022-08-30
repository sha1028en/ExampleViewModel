package com.sha1028en.exampleviewmodel.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sha1028en.exampleviewmodel.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var viewModel: MainViewModel
    private lateinit var bind : FragmentMainBinding

    // init
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        this.bind = FragmentMainBinding.inflate( LayoutInflater.from( this.context), container, false)
        return this.bind.root
    }

    //TODO UI UPDATE TASK HERE!
    override fun onActivityCreated( savedInstanceState: Bundle?) {
        super.onActivityCreated( savedInstanceState)
        viewModel = ViewModelProvider(this) [ MainViewModel::class.java]


        this.bind.FragmentMainTxt.text = "${ this.bind.FragmentMainTxt.text} ${ this.viewModel.getCnt() }"
        this.bind.FragmentMainTxt.setOnClickListener {
            this.bind.FragmentMainTxt.text =
                this.bind.FragmentMainTxt.text.substring( 0, this.bind.FragmentMainTxt.text.length -( this.viewModel.getCarry())) + this.viewModel.addCnt()
        }
    }
}