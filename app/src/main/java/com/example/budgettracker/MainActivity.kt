package com.example.budgettracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    private lateinit var transactions : ArrayList<Transaction>
    private lateinit var transactionAdapter: TransactionAdapter
    private lateinit var linearlayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        transactions = arrayListOf(
            Transaction("weekend plan",500.00),
            Transaction("a",-4.00),
            Transaction("wn",-5.00),
            Transaction("welan",-50.00),
            Transaction("ween",-53.00)
        )

        transactionAdapter = TransactionAdapter(transactions)
        linearlayoutManager = LinearLayoutManager(this)

        val recycleview = findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.recycleview)
        recycleview.apply{
            adapter = transactionAdapter
            layoutManager = linearlayoutManager
        }


    }

}