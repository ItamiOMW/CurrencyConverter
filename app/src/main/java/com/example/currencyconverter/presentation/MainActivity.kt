package com.example.currencyconverter.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.core.widget.addTextChangedListener
import com.example.currencyconverter.CurrencyApplication
import com.example.currencyconverter.R
import com.example.currencyconverter.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var viewModel: MainViewModel

    private val component by lazy {
        (application as CurrencyApplication).component
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
        observeViewModel()
    }

    private fun observeViewModel() {
        viewModel.result.observe(this) {
            binding.etTo.setText(it)
        }
    }

    private fun setListeners() {
        binding.etFrom.addTextChangedListener {
            val amount = binding.etFrom.text.toString()
            val from = binding.spinnerFrom.selectedItem.toString()
            val to = binding.spinnerTo.selectedItem.toString()
            if (checkIfAmountEntered()) {
                viewModel.convert(from, to, amount)
            }
        }
        binding.spinnerFrom.onItemSelectedListener = this
        binding.spinnerTo.onItemSelectedListener = this
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        val amount = binding.etFrom.text.toString()
        val from = binding.spinnerFrom.selectedItem.toString()
        val to = binding.spinnerTo.selectedItem.toString()
        if (checkIfAmountEntered()) {
            viewModel.convert(from, to, amount)
        }
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {}

    private fun checkIfAmountEntered(): Boolean {
        if (binding.etFrom.text.isNullOrBlank()) {
            return false
        }
        return true
    }

}